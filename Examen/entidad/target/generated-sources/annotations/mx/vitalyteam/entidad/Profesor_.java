package mx.vitalyteam.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.vitalyteam.entidad.UnidadAprendizaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-10T22:31:44")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile SingularAttribute<Profesor, Integer> idProf;
    public static volatile SingularAttribute<Profesor, String> apellidoMProf;
    public static volatile SingularAttribute<Profesor, String> rfcProf;
    public static volatile ListAttribute<Profesor, UnidadAprendizaje> unidadAprendizajeList;
    public static volatile SingularAttribute<Profesor, String> nombreProf;
    public static volatile SingularAttribute<Profesor, String> apellidoPProf;

}