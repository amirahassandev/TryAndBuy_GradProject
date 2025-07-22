package com.shop.shop.auth;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shop.shop.Model.UserModel;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;

  @PostMapping(value = "/register",consumes = {"application/json", "application/json;charset=UTF-8"}, produces = "application/json")
 public ResponseEntity<AuthenticationResponse> register(
      @RequestBody UserModel request
  ) {
    return ResponseEntity.ok(service.register(request));
  }
  @PostMapping("/authenticate")
  public ResponseEntity<Map<String, String>> authenticate(
      @RequestBody AuthenticationRequest request
  ) {
    return service.authenticate(request);
  }

}
