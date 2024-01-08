package com.parking.parkinglot.common;

public class UserDto {

    public UserDto(Long id,String username,String email)
    {
        this.id=id;
        this.username=username;
        this.email=email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    Long id;
    String email;
    String username;

}
