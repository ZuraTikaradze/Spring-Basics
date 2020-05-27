package ge.cse.jpademo.controller;

import ge.cse.jpademo.dto.appUser.AddUserInput;
import ge.cse.jpademo.dto.appUser.AddUserOutput;
import ge.cse.jpademo.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/AppUserController")
public class AppUserController {

    @Autowired
    AppUserService appUserService;

    @PostMapping("addUser")
    public AddUserOutput addUser(@RequestBody AddUserInput addUserInput) {
        return appUserService.addUser(addUserInput);
    }
}
