package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.Internet;
import ma.ensaj.tashilat.beans.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternetRepository extends JpaRepository<Internet, Integer> {
}
