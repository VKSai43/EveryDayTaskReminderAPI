package com.ketan.mychecklist.repo;

import com.ketan.mychecklist.repo.UserRepository;
import com.ketan.mychecklist.entity.MclUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    UserRepository userRepo;

    public MclUser saveUser(MclUser user){
        return userRepo.save(user);
    }
}
