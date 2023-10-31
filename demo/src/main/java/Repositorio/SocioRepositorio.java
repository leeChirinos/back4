package Repositorio;

import com.example.demo.Entity.Socio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocioRepositorio extends CrudRepository<Socio, Long> {

}
