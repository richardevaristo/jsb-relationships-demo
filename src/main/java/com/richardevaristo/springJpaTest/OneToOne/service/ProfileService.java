package com.richardevaristo.springJpaTest.OneToOne.service;

import com.richardevaristo.springJpaTest.OneToOne.dao.ProfileRepository;
import com.richardevaristo.springJpaTest.OneToOne.message.request.UserProfileRequest;
import com.richardevaristo.springJpaTest.OneToOne.model.Profile;
import com.richardevaristo.springJpaTest.OneToOne.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class ProfileService {

    @Autowired
    ProfileRepository profileRepository;

    public List<Profile> getAllUserProfiles() {
        return profileRepository.findAll();
    }

    public Profile getProfile(int id) {
        return profileRepository.findProfileById(id);
    }

    public Profile getProfileByUserId(int id) {
        return profileRepository.findProfileByUserId(id);
    }

    public Profile updateProfileByUserId(int id, UserProfileRequest request) {
        Profile profile = getProfileByUserId(id);
        User user = profile.getUser();

        user.setFirstName(request.getFirstName())
                .setLastName(request.getLastName())
                .setEmail(request.getEmail());

        profile.setAge(request.getAge())
                .setGender(request.getGender())
                .setAddress(request.getAddress());
        profile.setUser(user);

        return profileRepository.save(profile);

    }

    public String deleteUserProfileById(@PathVariable int id) {
        if(profileRepository.existsByUserId(id)) {
            profileRepository.deleteById(id);
            return "User Deleted!";
        }
        return "Error processing request -> User does not exist";
    }

    public Profile createUserProfile(UserProfileRequest request) {
        User user = new User();
        user.setFirstName(request.getFirstName())
                .setLastName(request.getLastName())
                .setEmail(request.getEmail());

        Profile profile = new Profile();
        profile.setAge(request.getAge())
                .setGender(request.getGender())
                .setAddress(request.getAddress());
        profile.setUser(user);

        return profileRepository.save(profile);
    }

}
