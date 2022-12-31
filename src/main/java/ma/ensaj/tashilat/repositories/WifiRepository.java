package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.Operator;
import ma.ensaj.tashilat.beans.Wifi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WifiRepository extends JpaRepository<Wifi, Integer> {

    List<Wifi> findWifiByCodeContains(String code);
    List<Wifi> findWifisByStateEqualsIgnoreCase(String state);
    List<Wifi> findWifiByCodeContainsAndStateEqualsIgnoreCase(String code, String state);

    @Query(value = "SELECT sum(price) FROM Wifi Where operator = ?1")
    public double getTotal(Operator operator);
}
