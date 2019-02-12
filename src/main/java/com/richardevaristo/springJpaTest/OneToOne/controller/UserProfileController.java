package com.richardevaristo.springJpaTest.OneToOne.controller;

import com.richardevaristo.springJpaTest.OneToOne.message.request.UserProfileRequest;
import com.richardevaristo.springJpaTest.OneToOne.message.response.MessageResponse;
import com.richardevaristo.springJpaTest.OneToOne.model.Profile;
import com.richardevaristo.springJpaTest.OneToOne.model.User;
import com.richardevaristo.springJpaTest.OneToOne.service.ProfileService;
import com.richardevaristo.springJpaTest.OneToOne.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserProfileController {

    @Autowired
    UserService userService;

    @Autowired
    ProfileService profileService;

//    ============================================================================

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/profiles")
    public List<Profile> getAllUserProfiles() {
        return profileService.getAllUserProfiles();
    }

//    ============================================================================

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @GetMapping("/profiles/{id}")
    public Profile getProfile(@PathVariable int id) {
        return profileService.getProfile(id);
    }

//    ============================================================================


    @GetMapping("/users/{id}/profiles")
    public Profile getProfileByUserId(@PathVariable int id) {
        return profileService.getProfileByUserId(id);
    }

    @GetMapping("/profiles/{id}/users")
    public User getUserByProfileId(@PathVariable int id) {
        return userService.getUserByProfileId(id);
    }

//    ============================================================================

    @PostMapping("/create-user")
    public Profile createUserProfile(@RequestBody UserProfileRequest request) {
        return profileService.createUserProfile(request);
    }

//    ============================================================================

    @PutMapping("/users/{id}/profiles/update")
    public Profile updateProfileByUserId(@PathVariable int id, @RequestBody UserProfileRequest request) {
        return profileService.updateProfileByUserId(id,request);
    }

//    ============================================================================
    @DeleteMapping("/users/{id}/delete")
    public ResponseEntity<?> deleteUserById(@PathVariable int id) {
        return new ResponseEntity<>(new MessageResponse(profileService.deleteUserProfileById(id)), HttpStatus.OK);
    }
}
