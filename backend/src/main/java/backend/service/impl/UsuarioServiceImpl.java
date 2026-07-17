package backend.service.impl;

import org.springframework.stereotype.Service;

import backend.entity.Usuario;
import backend.repository.UsuarioRepository;
import backend.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public boolean existeDocumento(String documento) {
        return usuarioRepository.existsByDocumento(documento);
    }

}