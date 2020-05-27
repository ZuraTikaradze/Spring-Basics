package ge.cse.jpademo.service.impl;

import ge.cse.jpademo.dto.appUser.AddUserInput;
import ge.cse.jpademo.dto.appUser.AddUserOutput;
import ge.cse.jpademo.dto.role.RoleDTO;
import ge.cse.jpademo.model.AppUser;
import ge.cse.jpademo.model.Role;
import ge.cse.jpademo.repository.AppUserRepository;
import ge.cse.jpademo.repository.RoleRepository;
import ge.cse.jpademo.service.AppUserService;
import ge.cse.jpademo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    AppUserRepository appUserRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    BCryptPasswordEncoder encoder;

    @Override
    public AddUserOutput addUser(AddUserInput addUserInput) {
        AppUser appUser = new AppUser();
        appUser.setUsername(addUserInput.getUsername());
        appUser.setPassword(encoder.encode(addUserInput.getPassword())); // პაროლის შიფრაცია

        // როლების მინიჭება იუზერისთვის
        List<Role> roles = new ArrayList<>();
        for (RoleDTO roleDTO : addUserInput.getRoles()) {
            Role role=roleRepository.getOne(roleDTO.getId()); // აქ შეიძლება როლითაც მოიძებნოს
            roles.add(role);
        }
        appUser.setRoles(roles);

        appUserRepository.save(appUser);
        AddUserOutput addUserOutput = new AddUserOutput();
        addUserOutput.setMsg("იუზერი წარმატებით დაემატა");
        return addUserOutput;
    }
}
