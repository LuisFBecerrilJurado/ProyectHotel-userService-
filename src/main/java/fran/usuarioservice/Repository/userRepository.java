package fran.usuarioservice.Repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<Long, User> {
}
