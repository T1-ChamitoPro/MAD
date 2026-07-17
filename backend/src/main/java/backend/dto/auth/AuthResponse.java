package backend.dto.auth;

public record AuthResponse(

        String mensaje,
        String token
) {}