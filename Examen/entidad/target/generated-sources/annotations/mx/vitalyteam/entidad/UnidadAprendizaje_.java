package mx.vitalyteam.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.vitalyteam.entidad.Profesor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-09T16:18:41")
@StaticMetamodel(UnidadAprendizaje.class)
public class UnidadAprendizaje_ { 

    public static volatile SingularAttribute<UnidadAprendizaje, Date> hraFinLab;
    public static volatile SingularAttribute<UnidadAprendizaje, Date> hraInicioLab;
    public static volatile SingularAttribute<UnidadAprendizaje, Date> hraFinClase;
    public static volatile SingularAttribute<UnidadAprendizaje, Integer> idUa;
    public static volatile SingularAttribute<UnidadAprendizaje, Date> hraInicioClase;
    public static volatile SingularAttribute<UnidadAprendizaje, Date> hraFinTaller;
    public static volatile SingularAttribute<UnidadAprendizaje, Date> hraInicioTaller;
    public static volatile SingularAttribute<UnidadAprendizaje, String> nombreUa;
    public static volatile ListAttribute<UnidadAprendizaje, Profesor> profesorList;

}