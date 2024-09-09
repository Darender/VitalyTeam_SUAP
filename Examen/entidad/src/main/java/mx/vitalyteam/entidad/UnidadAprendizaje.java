/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.vitalyteam.entidad;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jorge
 */
@Entity
@Table(name = "unidad_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadAprendizaje.findAll", query = "SELECT u FROM UnidadAprendizaje u")
    , @NamedQuery(name = "UnidadAprendizaje.findByIdUa", query = "SELECT u FROM UnidadAprendizaje u WHERE u.idUa = :idUa")
    , @NamedQuery(name = "UnidadAprendizaje.findByNombreUa", query = "SELECT u FROM UnidadAprendizaje u WHERE u.nombreUa = :nombreUa")
    , @NamedQuery(name = "UnidadAprendizaje.findByHraInicioLab", query = "SELECT u FROM UnidadAprendizaje u WHERE u.hraInicioLab = :hraInicioLab")
    , @NamedQuery(name = "UnidadAprendizaje.findByHraFinLab", query = "SELECT u FROM UnidadAprendizaje u WHERE u.hraFinLab = :hraFinLab")
    , @NamedQuery(name = "UnidadAprendizaje.findByHraInicioClase", query = "SELECT u FROM UnidadAprendizaje u WHERE u.hraInicioClase = :hraInicioClase")
    , @NamedQuery(name = "UnidadAprendizaje.findByHraFinClase", query = "SELECT u FROM UnidadAprendizaje u WHERE u.hraFinClase = :hraFinClase")
    , @NamedQuery(name = "UnidadAprendizaje.findByHraInicioTaller", query = "SELECT u FROM UnidadAprendizaje u WHERE u.hraInicioTaller = :hraInicioTaller")
    , @NamedQuery(name = "UnidadAprendizaje.findByHraFinTaller", query = "SELECT u FROM UnidadAprendizaje u WHERE u.hraFinTaller = :hraFinTaller")})
public class UnidadAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ua")
    private Integer idUa;
    @Basic(optional = false)
    @Column(name = "nombre_ua")
    private String nombreUa;
    @Basic(optional = false)
    @Column(name = "hra_inicio_lab")
    @Temporal(TemporalType.TIME)
    private Date hraInicioLab;
    @Basic(optional = false)
    @Column(name = "hra_fin_lab")
    @Temporal(TemporalType.TIME)
    private Date hraFinLab;
    @Basic(optional = false)
    @Column(name = "hra_inicio_clase")
    @Temporal(TemporalType.TIME)
    private Date hraInicioClase;
    @Basic(optional = false)
    @Column(name = "hra_fin_clase")
    @Temporal(TemporalType.TIME)
    private Date hraFinClase;
    @Basic(optional = false)
    @Column(name = "hra_inicio_taller")
    @Temporal(TemporalType.TIME)
    private Date hraInicioTaller;
    @Basic(optional = false)
    @Column(name = "hra_fin_taller")
    @Temporal(TemporalType.TIME)
    private Date hraFinTaller;
    @JoinTable(name = "imparte", joinColumns = {
        @JoinColumn(name = "id_UA", referencedColumnName = "id_ua")}, inverseJoinColumns = {
        @JoinColumn(name = "id_PROF", referencedColumnName = "id_prof")})
    @ManyToMany
    private List<Profesor> profesorList;

    public UnidadAprendizaje() {
    }

    public UnidadAprendizaje(Integer idUa) {
        this.idUa = idUa;
    }

    public UnidadAprendizaje(Integer idUa, String nombreUa, Date hraInicioLab, Date hraFinLab, Date hraInicioClase, Date hraFinClase, Date hraInicioTaller, Date hraFinTaller) {
        this.idUa = idUa;
        this.nombreUa = nombreUa;
        this.hraInicioLab = hraInicioLab;
        this.hraFinLab = hraFinLab;
        this.hraInicioClase = hraInicioClase;
        this.hraFinClase = hraFinClase;
        this.hraInicioTaller = hraInicioTaller;
        this.hraFinTaller = hraFinTaller;
    }

    public Integer getIdUa() {
        return idUa;
    }

    public void setIdUa(Integer idUa) {
        this.idUa = idUa;
    }

    public String getNombreUa() {
        return nombreUa;
    }

    public void setNombreUa(String nombreUa) {
        this.nombreUa = nombreUa;
    }

    public Date getHraInicioLab() {
        return hraInicioLab;
    }

    public void setHraInicioLab(Date hraInicioLab) {
        this.hraInicioLab = hraInicioLab;
    }

    public Date getHraFinLab() {
        return hraFinLab;
    }

    public void setHraFinLab(Date hraFinLab) {
        this.hraFinLab = hraFinLab;
    }

    public Date getHraInicioClase() {
        return hraInicioClase;
    }

    public void setHraInicioClase(Date hraInicioClase) {
        this.hraInicioClase = hraInicioClase;
    }

    public Date getHraFinClase() {
        return hraFinClase;
    }

    public void setHraFinClase(Date hraFinClase) {
        this.hraFinClase = hraFinClase;
    }

    public Date getHraInicioTaller() {
        return hraInicioTaller;
    }

    public void setHraInicioTaller(Date hraInicioTaller) {
        this.hraInicioTaller = hraInicioTaller;
    }

    public Date getHraFinTaller() {
        return hraFinTaller;
    }

    public void setHraFinTaller(Date hraFinTaller) {
        this.hraFinTaller = hraFinTaller;
    }

    @XmlTransient
    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUa != null ? idUa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadAprendizaje)) {
            return false;
        }
        UnidadAprendizaje other = (UnidadAprendizaje) object;
        if ((this.idUa == null && other.idUa != null) || (this.idUa != null && !this.idUa.equals(other.idUa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.vitalyteam.entidad.UnidadAprendizaje[ idUa=" + idUa + " ]";
    }
    
}
