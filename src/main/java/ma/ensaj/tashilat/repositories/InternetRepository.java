package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.Internet;
import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Phone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface InternetRepository extends JpaRepository<Internet, Integer> {

    @Query(value = "SELECT sum(price) FROM Internet Where operator = ?1")
    public double getTotal(Operator operator);
}
