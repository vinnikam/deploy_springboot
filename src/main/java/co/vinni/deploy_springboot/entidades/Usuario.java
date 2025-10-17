package co.vinni.deploy_springboot.entidades;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "usuarios")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_seq")
    @SequenceGenerator(name = "usuario_seq", sequenceName = "usuarios_seq", allocationSize = 1)
    @Column(nullable = false)
    private Long id;

    @Column(unique = true)
    private String nombre;

    private String apellido;
    private LocalDateTime fechaCreacion;

}
