package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PhoneRepository extends JpaRepository<Phone, Integer> {

    @Query(value = "SELECT sum(price) FROM Phone Where operator = ?1")
    public double getTotal(Operator operator);
}
