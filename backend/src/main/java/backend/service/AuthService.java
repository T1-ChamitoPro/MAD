package backend.service;

import backend.dto.auth.AuthResponse;
import backend.dto.auth.LoginRequest;
import backend.dto.auth.RegisterRequest;

public interface AuthService {

    AuthResponse registrar(RegisterRequest request);

    AuthResponse login(LoginRequest request);

}