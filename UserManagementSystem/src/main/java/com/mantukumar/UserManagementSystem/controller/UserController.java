package com.mantukumar.UserManagementSystem.controller;

import com.mantukumar.UserManagementSystem.models.User;
import com.mantukumar.UserManagementSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/userManagement")
public class UserController {

       @Autowired
       UserService userService;
//    endpoint to be provided
//    addUser
//    getUser/{userid}
//    getAllUser
//    updateUserInfo
//    deleteUser

    // Adding User Endpoint
    @PostMapping("/addUser")
    public String addUser(@RequestBody User user){
        return userService.addUserToList(user);
    }

    // GetAll Users
    @GetMapping(value = "/user/all")
    public List<User> getAllUserList(){
        return userService.getAllUserInList();
    }

    // Get User By id
    @GetMapping(value = "/getUserById/{user_id}")
    public User getUserByUserId(@PathVariable String user_id){
       return userService.getUserById(user_id);
    }


    @DeleteMapping(value = "/deleteUser/{user_id}")
    public String deleteUserById(@PathVariable String user_id){
        return userService.deleteUserById(user_id);
    }

}
