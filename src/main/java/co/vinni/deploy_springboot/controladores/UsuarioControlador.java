package co.vinni.deploy_springboot.controladores;

import co.vinni.deploy_springboot.entidades.Usuario;
import co.vinni.deploy_springboot.servicios.UsuarioServicio;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*")
public class UsuarioControlador {
    UsuarioServicio usuarioServicio;
    @GetMapping("/")
    public List<Usuario> obtenerTodos(){
        return usuarioServicio.obtenerTodos();
    }

    @PostMapping("/")
    public Usuario crear(@RequestBody Usuario usuario){
        usuario.setFechaCreacion(LocalDateTime.now());
        return usuarioServicio.crear(usuario);
    }
}
