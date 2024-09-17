/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "profesor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profesor.findAll", query = "SELECT p FROM Profesor p")
    , @NamedQuery(name = "Profesor.findByIdProf", query = "SELECT p FROM Profesor p WHERE p.idProf = :idProf")
    , @NamedQuery(name = "Profesor.findByRfcProf", query = "SELECT p FROM Profesor p WHERE p.rfcProf = :rfcProf")
    , @NamedQuery(name = "Profesor.findByNombreProf", query = "SELECT p FROM Profesor p WHERE p.nombreProf = :nombreProf")
    , @NamedQuery(name = "Profesor.findByApellidoPProf", query = "SELECT p FROM Profesor p WHERE p.apellidoPProf = :apellidoPProf")
    , @NamedQuery(name = "Profesor.findByApellidoMProf", query = "SELECT p FROM Profesor p WHERE p.apellidoMProf = :apellidoMProf")})
public class Profesor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_prof")
    private Integer idProf;
    @Basic(optional = false)
    @Column(name = "rfc_prof")
    private String rfcProf;
    @Basic(optional = false)
    @Column(name = "nombre_prof")
    private String nombreProf;
    @Basic(optional = false)
    @Column(name = "apellido_p_prof")
    private String apellidoPProf;
    @Basic(optional = false)
    @Column(name = "apellido_m_prof")
    private String apellidoMProf;
    @ManyToMany(mappedBy = "profesorList")
    private List<UnidadAprendizaje> unidadAprendizajeList;

    public Profesor() {
    }

    public Profesor(Integer idProf) {
        this.idProf = idProf;
    }

    public Profesor(Integer idProf, String rfcProf, String nombreProf, String apellidoPProf, String apellidoMProf) {
        this.idProf = idProf;
        this.rfcProf = rfcProf;
        this.nombreProf = nombreProf;
        this.apellidoPProf = apellidoPProf;
        this.apellidoMProf = apellidoMProf;
    }

    public Integer getIdProf() {
        return idProf;
    }

    public void setIdProf(Integer idProf) {
        this.idProf = idProf;
    }

    public String getRfcProf() {
        return rfcProf;
    }

    public void setRfcProf(String rfcProf) {
        this.rfcProf = rfcProf;
    }

    public String getNombreProf() {
        return nombreProf;
    }

    public void setNombreProf(String nombreProf) {
        this.nombreProf = nombreProf;
    }

    public String getApellidoPProf() {
        return apellidoPProf;
    }

    public void setApellidoPProf(String apellidoPProf) {
        this.apellidoPProf = apellidoPProf;
    }

    public String getApellidoMProf() {
        return apellidoMProf;
    }

    public void setApellidoMProf(String apellidoMProf) {
        this.apellidoMProf = apellidoMProf;
    }

    @XmlTransient
    public List<UnidadAprendizaje> getUnidadAprendizajeList() {
        return unidadAprendizajeList;
    }

    public void setUnidadAprendizajeList(List<UnidadAprendizaje> unidadAprendizajeList) {
        this.unidadAprendizajeList = unidadAprendizajeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProf != null ? idProf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profesor)) {
            return false;
        }
        Profesor other = (Profesor) object;
        if ((this.idProf == null && other.idProf != null) || (this.idProf != null && !this.idProf.equals(other.idProf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.vitalyteam.entidad.Profesor[ idProf=" + idProf + " ]";
    }
    
}
