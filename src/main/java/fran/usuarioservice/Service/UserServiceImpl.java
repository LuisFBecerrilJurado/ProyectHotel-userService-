package fran.usuarioservice.Service;

import fran.usuarioservice.Entity.User;
import fran.usuarioservice.Exceptions.NotFoundException;
import fran.usuarioservice.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        String rndID = UUID.randomUUID().toString();
        user.setUserID(rndID);
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(String id) {
        return userRepository.findById(id).orElseThrow(()-> new NotFoundException("User Not Found with id: " + id));
    }
}
