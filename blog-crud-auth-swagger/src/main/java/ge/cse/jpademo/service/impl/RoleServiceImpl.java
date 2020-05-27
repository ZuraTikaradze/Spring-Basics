package ge.cse.jpademo.service.impl;

import ge.cse.jpademo.dto.role.AddRoleInput;
import ge.cse.jpademo.dto.role.AddRoleOutput;
import ge.cse.jpademo.model.Role;
import ge.cse.jpademo.repository.RoleRepository;
import ge.cse.jpademo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository roleRepository;

    @Override
    public AddRoleOutput addRole(AddRoleInput addRoleInput) {
        Role role = new Role();
        role.setName(addRoleInput.getName());
        roleRepository.save(role);
        AddRoleOutput addRoleOutput=new AddRoleOutput();
        addRoleOutput.setMsg("როლი წარმატებით დაემატა");
        return addRoleOutput;
    }
}
