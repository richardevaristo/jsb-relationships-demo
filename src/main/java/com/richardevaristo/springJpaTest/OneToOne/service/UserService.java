package com.richardevaristo.springJpaTest.OneToOne.service;

import com.richardevaristo.springJpaTest.OneToOne.dao.ProfileRepository;
import com.richardevaristo.springJpaTest.OneToOne.dao.UserRepository;
import com.richardevaristo.springJpaTest.OneToOne.message.request.UserProfileRequest;
import com.richardevaristo.springJpaTest.OneToOne.model.Profile;
import com.richardevaristo.springJpaTest.OneToOne.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    ProfileRepository profileRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(int id) {
        return userRepository.findUserById(id);
    }

    public User getUserByProfileId(int id) {
        return userRepository.findUserByProfileId(id);
    }

    public List<User> createUserProfile(UserProfileRequest request) {
        User user = new User();
        user.setFirstName(request.getFirstName())
                .setLastName(request.getLastName())
                .setEmail(request.getEmail());

        Profile profile = new Profile();
        profile.setAge(request.getAge())
                .setGender(request.getGender())
                .setAddress(request.getAddress());
        profile.setUser(user);

        userRepository.save(user);

        return userRepository.findAll();
    }
}
