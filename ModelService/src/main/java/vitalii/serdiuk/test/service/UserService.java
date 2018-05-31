package vitalii.serdiuk.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vitalii.serdiuk.test.entity.User;
import vitalii.serdiuk.test.repository.UserRepository;

import java.sql.Date;
import java.util.List;

/**
 * Created by vserdiuk
 */

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }

    public User getById(Long id) {
        return repository.findById(id).get();
    }

    public void save(User user) {
        repository.save(user);
    }

    public void saveAll(List<User> userList) {
        repository.saveAll(userList);
    }

    public void remove(User user) {
        repository.delete(user);
    }

    public void removeById(Long id) {
        repository.deleteById(id);
    }

    public void removeAll() {
        repository.deleteAll();
    }

    public void removeAll(List<User> userList) {
        repository.deleteAll();
    }

    public User getByFirstNameAndLastName(String firstName, String lastName) {
        return repository.findByFirstNameAndLastName(firstName, lastName).get();
    }

    public User getByEmail(String email) {
        return repository.findByEmail(email).get();
    }

    public List<User> findUsersByBirthday(Date birthday) {
        return repository.findByBirthday(birthday).get();
    }

}
