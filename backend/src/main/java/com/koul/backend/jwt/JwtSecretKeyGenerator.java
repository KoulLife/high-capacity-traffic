package com.koul.backend.jwt;

import java.security.SecureRandom;
import java.util.Base64;

public class JwtSecretKeyGenerator {
    public static void main(String[] args) {
        // 32바이트(256비트) 난수 생성
        byte[] keyBytes = new byte[32];
        new SecureRandom().nextBytes(keyBytes);

        // Base64 인코딩
        String secretKey = Base64.getUrlEncoder().withoutPadding().encodeToString(keyBytes);

        // 생성된 시크릿 키 출력
        System.out.println("Generated JWT Secret Key: " + secretKey);
    }
}
