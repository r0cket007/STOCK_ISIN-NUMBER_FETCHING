package com.example.demo.controller;
import com.example.demo.model.User;
import com.example.demo.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/stock")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("")
    public List<User> list() {
        return userService.listAllSTOCK();
    }

    @GetMapping("/{firstname}")
    public ResponseEntity<User> get(@PathVariable("firstname") String firstname )
    {
        try
        {
            User user = userService.getSTOCK_SYMBOL(firstname);
            return new ResponseEntity<User>(user, HttpStatus.OK ) ;
        }
        catch (NoSuchElementException e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}