package backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import backend.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

    boolean existsByDocumento(String documento);
    Optional<Usuario> findByDocumento(String documento);
}