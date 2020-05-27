package ge.cse.jpademo.dto.appUser;

import lombok.Data;

// მოდელი ავტორიზაციისთვის
@Data
public class UserCredentials {
    private String username;
    private String password;
}
