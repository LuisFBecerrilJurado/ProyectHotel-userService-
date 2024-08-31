package fran.usuarioservice.Controller;

import fran.usuarioservice.Entity.User;
import fran.usuarioservice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/newUser")
    public ResponseEntity<User> saveUser(@RequestBody User user){
        User savedUser = userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }

    @GetMapping("/{userID}")
    public ResponseEntity<User> getUser(@PathVariable String userID){
        User user = userService.getUserById(userID);
        return ResponseEntity.ok(user);
    }

    @GetMapping()
    public ResponseEntity<List<User>> getAllUser(){
        List<User> user = userService.getAllUsers();
        return ResponseEntity.ok(user);
    }
}
