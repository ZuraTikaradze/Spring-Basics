package ge.cse.jpademo.dto.appUser;

import ge.cse.jpademo.dto.role.RoleDTO;
import lombok.Data;

import java.util.List;


@Data
public class AddUserInput {
    private String username;
    private String password;
    private List<RoleDTO> roles;
}
