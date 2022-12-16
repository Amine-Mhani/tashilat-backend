package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {
}
