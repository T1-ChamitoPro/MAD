package backend.service.impl;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import backend.dto.auth.AuthResponse;
import backend.dto.auth.LoginRequest;
import backend.dto.auth.RegisterRequest;
import backend.entity.Usuario;
import backend.repository.UsuarioRepository;
import backend.service.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(
            UsuarioRepository usuarioRepository,
            PasswordEncoder passwordEncoder
    ) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public AuthResponse registrar(RegisterRequest request) {

        if (usuarioRepository.existsByDocumento(request.documento())) {
            throw new RuntimeException("Ya existe un usuario con ese documento.");
        }

        Usuario usuario = new Usuario();

        usuario.setDocumento(request.documento());
        usuario.setNombre(request.nombre());
        usuario.setApellido(request.apellido());

        usuario.setPassword(passwordEncoder.encode(request.password()));

        usuario.setRol(request.rol());

        usuarioRepository.save(usuario);

        return new AuthResponse("Usuario registrado correctamente", null);
    }

    @Override
    public AuthResponse login(LoginRequest request) {

        return new AuthResponse("Pendiente", null);

    }
}