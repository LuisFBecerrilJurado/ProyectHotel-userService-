package fran.usuarioservice.Service;

import fran.usuarioservice.Entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(String id);
}
