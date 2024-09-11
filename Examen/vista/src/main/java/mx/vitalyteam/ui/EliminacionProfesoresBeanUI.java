import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.List;
import mx.vitalyteam.entidad.Profesor;
import mx.vitalyteam.helper.EliminacionProfesoresHelper;

@ManagedBean(name = "EliminacionUI")
@SessionScoped
public class EliminacionProfesoresBeanUI {

    private List<Profesor> profesoresRegistrados;
    private EliminacionProfesoresHelper eliminadorProfesoresHelper;

    public EliminacionProfesoresBeanUI() {
        eliminadorProfesoresHelper = new EliminacionProfesoresHelper();
    }

    @PostConstruct
    public void init() {
        profesoresRegistrados = eliminadorProfesoresHelper.obtenerListaProfesores();
    }

    public List<Profesor> getListaProfesores() {
        return profesoresRegistrados;
    }

    public String eliminarProfesor(int id) {
        eliminadorProfesoresHelper.eliminarProfesorPorId(id);  // Lógica de eliminación
        profesoresRegistrados = eliminadorProfesoresHelper.obtenerListaProfesores();  // Actualiza la lista después de la eliminación
        return null;  // Permanecer en la misma página
    }
}
