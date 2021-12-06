package com.jg.apirest.APIREST.Fundation.Owner.Controller;

import com.jg.apirest.APIREST.Fundation.Owner.Model.Propietario;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Controller
@Repository
public class ListOwner {

    private final JdbcTemplate jdbcTemplate;

    public ListOwner(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Propietario> listPropietarios(){
        String sql = "Select * FROM propietario;";
        return jdbcTemplate.query(sql,this::listPropietario);
    }
    public Propietario listPropietario(ResultSet rs, int Row)throws SQLException {
        int id = rs.getInt("idpropietario");
        String nombre = rs.getString("nombre");
        String direccion = rs.getString("direccion");
        String telefono = rs.getString("telefono");
        String correo = rs.getString("correo");
        String comentarios = rs.getString("comentarios");
        return new Propietario(id,nombre,direccion,telefono,correo,comentarios);
    }
}
