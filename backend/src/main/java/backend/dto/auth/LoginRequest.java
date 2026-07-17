package backend.dto.auth;

public record LoginRequest(

        String documento,
        String password

) {}