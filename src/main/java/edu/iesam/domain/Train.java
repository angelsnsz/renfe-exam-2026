package edu.iesam.domain;

public class Train {
    private String id;
    private String nombre;
    private String años;
    private String estación;

    public Train(String id, String nombre, String años, String estación) {
        this.id = id;
        this.nombre = nombre;
        this.años = años;
        this.estación = estación;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAños() {
        return años;
    }

    public void setAños(String años) {
        this.años = años;
    }

    public String getEstación() {
        return estación;
    }

    public void setEstación(String estación) {
        this.estación = estación;
    }
}
