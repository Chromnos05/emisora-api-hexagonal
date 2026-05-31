package com.udc.emisora_app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emisoras")
public class Emisora {

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

    // Constructor vacío exigido por JPA
    public Emisora() {
    }

    // --- Getters y Setters ---

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public String getBandaFm() {
        return bandaFm;
    }

    public void setBandaFm(String bandaFm) {
        this.bandaFm = bandaFm;
    }

    public String getBandaAm() {
        return bandaAm;
    }

    public void setBandaAm(String bandaAm) {
        this.bandaAm = bandaAm;
    }

    public Integer getNumLocutores() {
        return numLocutores;
    }

    public void setNumLocutores(Integer numLocutores) {
        this.numLocutores = numLocutores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getNumProgramas() {
        return numProgramas;
    }

    public void setNumProgramas(Integer numProgramas) {
        this.numProgramas = numProgramas;
    }

    public Integer getNumCiudades() {
        return numCiudades;
    }

    public void setNumCiudades(Integer numCiudades) {
        this.numCiudades = numCiudades;
    }
}
