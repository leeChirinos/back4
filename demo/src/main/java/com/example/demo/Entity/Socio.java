package com.example.demo.Entity;

import com.example.demo.Enum.Activo;
import com.example.demo.Enum.Sectorizacion;
import com.example.demo.Enum.TipoSocio;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

    @Data
    @Entity
        @Table(name="socios")
        public class Socio implements Serializable {
        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        private Long idSocio;

        @Column(name="nombreSocio", nullable=false, length = 12)
        private String nombreSocio;

        @Column(name="cuit", nullable=false, length = 50)
        private String cuit;

        @Column(name="telefono", nullable=false, length = 13)
        private String telefono;


        @Column(name="email", nullable=true, length = 30, unique=true)
        private String email;

        @Column(name="pagina_web", nullable=true, length = 13)
        private String paginaWeb;

        @Column(name="perfil_socio", nullable=true, length = 20)
        private String perfilSocio;

        @Column(name="fecha_alta")
        @Temporal(TemporalType.DATE)
        private Date fechaAlta;

        @Column(name="fecha_modificacion")
        @Temporal(TemporalType.DATE)
        private Date fechaModificacion;
        @Column(name="fecha_baja")
        @Temporal(TemporalType.DATE)
        private Date fechaBaja;

        @Enumerated(value=EnumType.STRING)
        private TipoSocio tipoSocio;

        @Enumerated(value=EnumType.STRING)
        private Activo activo;

        @Enumerated(value=EnumType.STRING)
        private Sectorizacion sectorizacion;

        @ManyToOne
        @JoinColumn(name="domicilio")
        Domicilio domicilio;

        @ManyToOne
        @JoinColumn(name="sector")
        Sector sector;

        public void setIdSocio(Long idSocio) {
        this.idSocio = idSocio;
        }

        public String getNombreSocio() {
            return nombreSocio;
        }

        public void setNombreSocio(String nombreSocio) {
            this.nombreSocio = nombreSocio;
        }

        public String getCuit() {
            return cuit;
        }

        public void setCuit(String cuit) {
            this.cuit = cuit;
        }

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPaginaWeb() {
            return paginaWeb;
        }

        public void setPaginaWeb(String paginaWeb) {
            this.paginaWeb = paginaWeb;
        }

        public String getPerfilSocio() {
            return perfilSocio;
        }

        public void setPerfilSocio(String perfilSocio) {
            this.perfilSocio = perfilSocio;
        }

        public Date getFechaAlta() {
            return fechaAlta;
        }

        public void setFechaAlta(Date fechaAlta) {
            this.fechaAlta = fechaAlta;
        }

        public Date getFechaModificacion() {
            return fechaModificacion;
        }

        public void setFechaModificacion(Date fechaModificacion) {
            this.fechaModificacion = fechaModificacion;
        }

        public Date getFechaBaja() {
            return fechaBaja;
        }

        public void setFechaBaja(Date fechaBaja) {
            this.fechaBaja = fechaBaja;
        }

        public TipoSocio getTipoSocio() {
            return tipoSocio;
        }

        public void setTipoSocio(TipoSocio tipoSocio) {
            this.tipoSocio = tipoSocio;
        }

        public Activo getActivo() {
            return activo;
        }

        public void setActivo(Activo activo) {
            this.activo = activo;
        }

        public Sectorizacion getSectorizacion() {
            return sectorizacion;
        }

        public void setSectorizacion(Sectorizacion sectorizacion) {
            this.sectorizacion = sectorizacion;
        }

        public Domicilio getDomicilio() {
            return domicilio;
        }

        public void setDomicilio(Domicilio domicilio) {
            this.domicilio = domicilio;
        }

        public Sector getSector() {
            return sector;
        }

        public void setSector(Sector sector) {
            this.sector = sector;
        }

        public String getidSocio() {
            return null;
        }
    }

