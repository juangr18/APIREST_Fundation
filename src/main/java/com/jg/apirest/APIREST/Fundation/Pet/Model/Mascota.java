package com.jg.apirest.APIREST.Fundation.Pet.Model;

public class Mascota {
    private final int id;

    private final String nombre;

    private final int tipoMascota;

    private final int propietario;

    public Mascota(int id, String nombre, int tipoMascota, int propietario) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMascota = tipoMascota;
        this.propietario = propietario;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipoMascota() {
        return tipoMascota;
    }

    public int getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "idMascota=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoMascota=" + tipoMascota +
                ", propietario=" + propietario +
                '}';
    }
}
