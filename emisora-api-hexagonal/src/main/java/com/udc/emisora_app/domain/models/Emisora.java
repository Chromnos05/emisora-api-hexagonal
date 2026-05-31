package com.udc.emisora_app.domain.models;

public class Emisora {

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

    public Emisora() {
    }

    public Emisora(Long id, String nombre, String canal, String bandaFm, String bandaAm, Integer numLocutores, String genero, String horario, String patrocinador, String pais, String descripcion, Integer numProgramas, Integer numCiudades) {
        this.id = id;
        this.nombre = nombre;
        this.canal = canal;
        this.bandaFm = bandaFm;
        this.bandaAm = bandaAm;
        this.numLocutores = numLocutores;
        this.genero = genero;
        this.horario = horario;
        this.patrocinador = patrocinador;
        this.pais = pais;
        this.descripcion = descripcion;
        this.numProgramas = numProgramas;
        this.numCiudades = numCiudades;
    }

    // --- Getters y Setters ---
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCanal() { return canal; }
    public void setCanal(String canal) { this.canal = canal; }
    public String getBandaFm() { return bandaFm; }
    public void setBandaFm(String bandaFm) { this.bandaFm = bandaFm; }
    public String getBandaAm() { return bandaAm; }
    public void setBandaAm(String bandaAm) { this.bandaAm = bandaAm; }
    public Integer getNumLocutores() { return numLocutores; }
    public void setNumLocutores(Integer numLocutores) { this.numLocutores = numLocutores; }
    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }
    public String getHorario() { return horario; }
    public void setHorario(String horario) { this.horario = horario; }
    public String getPatrocinador() { return patrocinador; }
    public void setPatrocinador(String patrocinador) { this.patrocinador = patrocinador; }
    public String getPais() { return pais; }
    public void setPais(String pais) { this.pais = pais; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public Integer getNumProgramas() { return numProgramas; }
    public void setNumProgramas(Integer numProgramas) { this.numProgramas = numProgramas; }
    public Integer getNumCiudades() { return numCiudades; }
    public void setNumCiudades(Integer numCiudades) { this.numCiudades = numCiudades; }
}