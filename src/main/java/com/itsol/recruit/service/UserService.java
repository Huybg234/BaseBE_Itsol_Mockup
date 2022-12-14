package com.itsol.recruit.service;

import com.itsol.recruit.entity.User;

import java.util.List;

public interface UserService {

    public List<User> getAllUser();

    public User findById(Long id);

    public User findUserByUserName(String userName);

    public User save(User user);

    int updateUserPassword(String userName,String password);

    int updateUserAvatarName(String avatarName, long id);

//    User updateUserAvatarName();
    public List<User> findAll();
}
