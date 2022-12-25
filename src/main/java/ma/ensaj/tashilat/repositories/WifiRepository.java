package ma.ensaj.tashilat.repositories;

import ma.ensaj.tashilat.beans.Wifi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WifiRepository extends JpaRepository<Wifi, Integer> {

    List<Wifi> findWifiByCodeContains(String code);
}
