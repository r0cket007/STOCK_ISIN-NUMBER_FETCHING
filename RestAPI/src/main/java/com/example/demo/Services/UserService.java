package com.example.demo.Services;

import com.example.demo.model.User;
import com.example.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> listAllSTOCK() {
        return userRepository.findAll();
    }
    public User getSTOCK_SYMBOL( String firstname )
    {
        return userRepository.findById( firstname ).get( );
    }

}