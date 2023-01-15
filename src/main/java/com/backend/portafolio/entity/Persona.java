package com.backend.portafolio.entity;

import jakarta.persistence.Column;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table (name= "persona")
public class Persona {    
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 100)
    private String nombre;
    @Column(length = 100)
    private String apellido;
    @Column(length = 400)
    private String domicilio;
    @Column(length = 200)
    private String telefono;
    @Column(length = 500)
    private String correo;
    @Column(length = 3000)
    private String sobre_mi;
    @Column(length = 2000)
    private String url_foto;
    @Column(length = 3000)
    private String titulo;
    @Column(length = 100)
    private String edad;
    @Column(length = 3000)
    private String cumpleanos;
    @Column(length = 3000)
    private String nacionalidad;
    @Column(length = 3000)
    private String cv; 
    
    public Persona() {

    }

    public Persona(Integer id, String nombre, String apellido, String domicilio, String telefono, String correo, String sobre_mi, String url_foto, String titulo, String edad, String cumpleanos, String nacionalidad, String cv, List<Estudio> estudios, List<Experiencia> experiencias, List<Proyecto> proyectos, List<Servicio> servicios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.correo = correo;
        this.sobre_mi = sobre_mi;
        this.url_foto = url_foto;
        this.titulo = titulo;
        this.edad = edad;
        this.cumpleanos = cumpleanos;
        this.nacionalidad = nacionalidad;
        this.cv = cv;

    }
}
