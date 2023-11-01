package DataServices;

import Repositorio.SocioRepository;
import com.example.demo.Entity.Socio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SocioDataServices {
    @Autowired
    private SocioRepository socioRepository;

    public void save(Socio socio){
        socioRepository.save(socio);
    }

    public void remove(Long idSocio){
        socioRepository.delete(socioRepository.findById(idSocio).get());
    }

    public void update(Socio socio){

        socioRepository.save(socio);
    }

    public Socio getById(Long idSocio){

        return socioRepository.findById(Long idSocio);
    }

    public List<Socio> getAll(){

        return (List<Socio>)socioRepository.findAll();
    }

    public List<Socio> getLikenombreSocio(String nombreSocio){
        return (List<Socio>)socioRepository.findBynombreSocioContainingIgnoreCase(nombreSocio);
    }

    public List<Socio> getLikeCuit(String cuit){
        return (List<Socio>)socioRepository.findByCuitContaining(cuit);
    }

    public Socio getByCuit(String cuit){

        return socioRepository.findByCuit(cuit).get(0);
    }

}
