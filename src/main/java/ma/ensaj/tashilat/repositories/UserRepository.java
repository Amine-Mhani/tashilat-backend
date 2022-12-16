package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
