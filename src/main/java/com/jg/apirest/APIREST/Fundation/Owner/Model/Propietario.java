package com.jg.apirest.APIREST.Fundation.Owner.Model;

public class Propietario {
    private final int id;

    private final String nombre;

    private final String direccion;

    private final String telefono;

    private final String correo;

    private final String comentarios;

    public Propietario(int id, String nombre, String direccion, String telefono, String correo, String comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.comentarios = comentarios;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
