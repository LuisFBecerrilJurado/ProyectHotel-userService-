package fran.usuarioservice.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="users")
@Data
public class User {
    @Id
    private String userID;
    private String name;
    private String email;
    private String information;
}
