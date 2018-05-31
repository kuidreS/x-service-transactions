package vitalii.serdiuk.test.repository;

import org.springframework.data.repository.CrudRepository;
import vitalii.serdiuk.test.entity.User;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

/**
 * Created by vserdiuk
 */

public interface UserRepository extends CrudRepository<User, Long> {

    Optional<User> findByFirstNameAndLastName(String firstName, String lastName);

    Optional<User> findByEmail(String email);

    Optional<List<User>> findByBirthday(Date birthday);

}
