package servicio;
import com.example.demo.Entity.Socio;
import java.util.List;

public interface ISocioServicio {

    //Método que ingresa socios
    public void insert (Socio socio);

    // Método que muestra lista con total de socios-->getAll?? preguntar a Ezequiel
    public List<Socio> ListaTotalSocios();
}
