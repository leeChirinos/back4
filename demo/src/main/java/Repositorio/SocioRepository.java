package Repositorio;

import com.example.demo.Entity.Socio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Long> {
    public abstract List<Socio> findBynombreSocioContainingIgnoreCase(String nombreSocio);
    public abstract List<Socio>findByCuit(String cuit);
    public abstract List<Socio>findByCuitContaining(String cuit);

}
