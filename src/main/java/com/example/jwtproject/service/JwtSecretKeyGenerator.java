package com.example.jwtproject.service;

import io.jsonwebtoken.security.Keys;

import java.security.Key;
import java.util.Base64;

public class JwtSecretKeyGenerator {

    public static void main(String[] args) {
        // Generate a secure random secret key
        Key key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS512);

        // Encode the key in Base64 to store in application properties
        String secretKey = Base64.getEncoder().encodeToString(key.getEncoded());

        System.out.println("Generated Secret Key: " + secretKey);
    }
}
