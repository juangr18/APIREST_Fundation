package com.jg.apirest.APIREST.Fundation.Type.Model;

public class TipoMascota {
    private final String id;

    private final String comentarios;

    public TipoMascota(String id, String comentarios) {
        this.id = id;
        this.comentarios = comentarios;
    }

    public String getId() {
        return id;
    }

    public String getComentarios() {
        return comentarios;
    }

    @Override
    public String toString() {
        return "TipoMascota{" +
                "id='" + id + '\'' +
                ", comentarios='" + comentarios + '\'' +
                '}';
    }
}
