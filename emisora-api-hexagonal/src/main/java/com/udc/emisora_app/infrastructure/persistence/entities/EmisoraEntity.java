package com.udc.emisora_app.infrastructure.persistence.entities;

import com.udc.emisora_app.domain.models.Emisora;
import jakarta.persistence.*;

@Entity
@Table(name = "emisoras")
public class EmisoraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String canal;
    private String bandaFm;
    private String bandaAm;
    private Integer numLocutores;
    private String genero;
    private String horario;
    private String patrocinador;
    private String pais;
    private String descripcion;
    private Integer numProgramas;
    private Integer numCiudades;

    public EmisoraEntity() {}

    public static EmisoraEntity fromDomain(Emisora e) {
        EmisoraEntity entity = new EmisoraEntity();
        entity.id = e.getId(); entity.nombre = e.getNombre(); entity.canal = e.getCanal();
        entity.bandaFm = e.getBandaFm(); entity.bandaAm = e.getBandaAm();
        entity.numLocutores = e.getNumLocutores(); entity.genero = e.getGenero();
        entity.horario = e.getHorario(); entity.patrocinador = e.getPatrocinador();
        entity.pais = e.getPais(); entity.descripcion = e.getDescripcion();
        entity.numProgramas = e.getNumProgramas(); entity.numCiudades = e.getNumCiudades();
        return entity;
    }

    public Emisora toDomain() {
        return new Emisora(id, nombre, canal, bandaFm, bandaAm, numLocutores, genero, horario, patrocinador, pais, descripcion, numProgramas, numCiudades);
    }

    // (Añade aquí los Getters y Setters estándar para todos los atributos)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
}