package org.launchcode.spaday.models;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min=5, max=15, message="Username must be between 5 and 15 characters")
    private String username;
    @Email(message = "Please enter a valid email address.")
    private String email;
    @NotBlank(message = "please enter a password.")
    @Size(min=6, message = "Password must be at least 6 characters long.")
    private String password;

    @NotBlank(message = "please verify your password.")
    private String verify;

    public User() {

    }

    public User(String username, String email, String password) {
        this();
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }
}