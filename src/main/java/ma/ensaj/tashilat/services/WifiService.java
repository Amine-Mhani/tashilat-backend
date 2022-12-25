package ma.ensaj.tashilat.services;

import ma.ensaj.tashilat.beans.Wifi;
import ma.ensaj.tashilat.repositories.WifiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
@Service
public class WifiService {

    @Autowired
    WifiRepository wifiRepository;

    public List<Wifi> findAll(){
        return wifiRepository.findAll();
    }

    public Wifi findById(int id){
        return wifiRepository.findById(id).get();
    }

    public void create(Wifi wifi){
        wifiRepository.save(wifi);
    }

    public void update(Wifi wifi){
        wifiRepository.save(wifi);
    }

    public void delete(int id){
        wifiRepository.delete(wifiRepository.findById(id).get());
    }

    public List<Wifi> findByCode(String code){
       return wifiRepository.findWifiByCodeContains(code);
    }
}
