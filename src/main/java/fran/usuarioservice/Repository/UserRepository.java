package fran.usuarioservice.Repository;

import fran.usuarioservice.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<Long, UserEntity> {
}
