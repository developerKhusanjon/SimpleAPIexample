package com.example.my_spring_app.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/users")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }

    @RequestMapping("users/{id}")
    public Optional<User> getUser(@PathVariable("id") String id) {
        return userService.getUser(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.PUT)
    public void updateUser(@PathVariable("id") String idd, @RequestBody User user) {
        userService.updateUser(idd,user);
    }

    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable("id") String idd) {
        userService.deleteUser(idd);
    }

    @RequestMapping(value = "/users/location/{id}")
    public List<User> getUsersByLocationId(@PathVariable String id){
        return userService.getUserByLocationId(id);
    }
}
