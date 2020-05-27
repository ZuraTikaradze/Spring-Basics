package ge.cse.jpademo.controller;

import ge.cse.jpademo.dto.role.AddRoleInput;
import ge.cse.jpademo.dto.role.AddRoleOutput;
import ge.cse.jpademo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/RoleController")
public class RoleController {
    @Autowired
    RoleService roleService;

    @PostMapping("addRole")
    public AddRoleOutput addRole(@RequestBody AddRoleInput addRoleInput) {
        return roleService.addRole(addRoleInput);
    }

}
