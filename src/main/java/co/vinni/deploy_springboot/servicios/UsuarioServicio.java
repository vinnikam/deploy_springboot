package co.vinni.deploy_springboot.servicios;

import co.vinni.deploy_springboot.entidades.Usuario;
import co.vinni.deploy_springboot.repositorios.UsuarioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioServicio {
    UsuarioRepositorio usuarioRepositorio;

    public Usuario crear(Usuario usuario){
        return usuarioRepositorio.save(usuario);
    }
    public List<Usuario> obtenerTodos(){
        return usuarioRepositorio.findAll();
    }
}
