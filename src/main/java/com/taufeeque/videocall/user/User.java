package com.taufeeque.videocall.user;

import lombok.Builder;
import lombok.Data;

/*
 * 1. Create User Entity Class
 * 2. Create UserService Class
 * 3. Create UserController Class
 * 4. Create Front-End for this App*/

@Data
@Builder
public class User {

    private String username;
    private String email;
    private String password;
    private String status;

}
