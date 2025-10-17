package co.vinni.deploy_springboot.repositorios;

import co.vinni.deploy_springboot.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
}
