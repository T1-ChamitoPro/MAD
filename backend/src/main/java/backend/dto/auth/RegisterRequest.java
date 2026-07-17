package backend.dto.auth;

import backend.entity.Rol;

public record RegisterRequest(

        String documento,
        String nombre,
        String apellido,
        String password,
        Rol rol

) {}