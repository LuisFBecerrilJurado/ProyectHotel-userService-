package fran.usuarioservice.Entity;

/*
  * Clase para el modelado de la entidad Usuario para el proyecto "HOTEL"
  *
*/


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;
    @Column(unique=true)
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private String information;
}
