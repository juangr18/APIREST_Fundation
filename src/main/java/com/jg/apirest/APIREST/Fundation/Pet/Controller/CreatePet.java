package com.jg.apirest.APIREST.Fundation.Pet.Controller;

import com.jg.apirest.APIREST.Fundation.Pet.Model.Mascota;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;


@Controller
@Repository
public class CreatePet {

    private final JdbcTemplate jdbcTemplate;

    public CreatePet(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void createPet(Mascota mascota) {
        String sql = "INSERT INTO mascota (nombre,tipo_mascota,propietario) VALUES(?,?,?);";
        PreparedStatementSetter setter = ps -> {
          ps.setString(1,mascota.getNombre());
          ps.setInt(2,mascota.getTipoMascota());
          ps.setInt(3,mascota.getPropietario());
        };
        jdbcTemplate.update(sql,setter);
    }
}