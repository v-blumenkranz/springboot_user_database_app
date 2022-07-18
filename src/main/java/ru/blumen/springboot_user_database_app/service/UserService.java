package ru.blumen.springboot_user_database_app.service;
import org.springframework.stereotype.Service;
import ru.blumen.springboot_user_database_app.model.User;
import ru.blumen.springboot_user_database_app.repository.UserRepository;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    public void saveUser(User user) {
        userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.getReferenceById(id);
    }

    public void updateUser(User user) {
        User userToBeUpdated = userRepository.getReferenceById(user.getId());
        userToBeUpdated.setName(user.getName());
        userToBeUpdated.setEmail(user.getEmail());
        userToBeUpdated.setAddress(user.getAddress());
        userRepository.flush();
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
