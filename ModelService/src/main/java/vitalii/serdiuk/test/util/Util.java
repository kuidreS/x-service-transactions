package vitalii.serdiuk.test.util;

import vitalii.serdiuk.test.dto.UserDto;
import vitalii.serdiuk.test.entity.User;

/**
 * Created by vserdiuk
 */

public class Util {

    public static User convertDtoToUser(UserDto userDto) {
        User user = new User();
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setBirthday(userDto.getBirthday());
        return user;
    }

}
