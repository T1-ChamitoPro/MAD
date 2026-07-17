package backend.service;

import backend.entity.Usuario;

public interface UsuarioService {

    Usuario guardar(Usuario usuario);

    boolean existeDocumento(String documento);

}