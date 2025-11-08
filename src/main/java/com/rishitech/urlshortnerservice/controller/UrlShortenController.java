package com.rishitech.urlshortnerservice.controller;

import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.Base64;

@RestController
@RequestMapping("/api")
public class UrlShortenController {

    @GetMapping("/health")
    public LocalDateTime health() {
        return LocalDateTime.now();
    }

    @PostMapping("/encode")
    public String encode(@RequestBody String value) {
        return Base64.getEncoder().encodeToString(value.getBytes(StandardCharsets.UTF_8));
    }

    @PostMapping("/decode")
    public String deccode(@RequestBody  String value) {
        return new String(Base64.getDecoder().decode(value), StandardCharsets.UTF_8);
    }

}


