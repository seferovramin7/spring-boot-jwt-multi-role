package com.example.jwtproject.model;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class AuthResponse {
    private String token;
    private String username;
    private Collection<? extends GrantedAuthority> authorities;

    public AuthResponse(String token, String username, Collection<? extends GrantedAuthority> authorities) {
        this.token = token;
        this.username = username;
        this.authorities = authorities;
    }

    public String getToken() {
        return token;
    }

    public String getUsername() {
        return username;
    }

    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }
}
