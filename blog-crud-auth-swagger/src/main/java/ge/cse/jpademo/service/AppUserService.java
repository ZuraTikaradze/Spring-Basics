package ge.cse.jpademo.service;

import ge.cse.jpademo.dto.appUser.AddUserInput;
import ge.cse.jpademo.dto.appUser.AddUserOutput;

public interface AppUserService {
    AddUserOutput addUser(AddUserInput addUserInput);
}
