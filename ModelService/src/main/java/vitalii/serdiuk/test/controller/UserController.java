package vitalii.serdiuk.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import vitalii.serdiuk.test.dto.UserDto;
import vitalii.serdiuk.test.entity.User;
import vitalii.serdiuk.test.service.UserService;
import vitalii.serdiuk.test.util.Util;

import javax.websocket.server.PathParam;
import java.sql.Date;
import java.util.List;

/**
 * Created by vserdiuk
 */

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService service;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public void createTask (@RequestBody UserDto userDto) {
        User user = Util.convertDtoToUser(userDto);
        service.save(user);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllTasks() {
        return service.getAll();
    }

    @RequestMapping(value = "/usersByBirthday/{birthday}", method = RequestMethod.GET)
    public List<User> getUsersByBirthday(@PathVariable("birthday") Date birthday) {
        return service.findUsersByBirthday(birthday);
    }

}
