package ge.cse.jpademo.service;

import ge.cse.jpademo.dto.role.AddRoleInput;
import ge.cse.jpademo.dto.role.AddRoleOutput;

public interface RoleService {
    AddRoleOutput addRole(AddRoleInput addRoleInput);
}
