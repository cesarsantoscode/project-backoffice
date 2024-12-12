package pe.edu.cibertec.project_backoffice.repository;

import org.springframework.data.repository.CrudRepository;
import pe.edu.cibertec.project_backoffice.entity.User;

import java.util.Optional;

public interface UserRepository extends CrudRepository<User, Integer> {

    Optional<User> findByUsername(String username);

}
