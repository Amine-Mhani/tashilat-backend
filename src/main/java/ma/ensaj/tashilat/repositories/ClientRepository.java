package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
}
