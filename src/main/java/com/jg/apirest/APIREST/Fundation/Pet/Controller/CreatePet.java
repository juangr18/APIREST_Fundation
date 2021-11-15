package com.jg.apirest.APIREST.Fundation.Pet.Controller;

import com.jg.apirest.APIREST.Fundation.Commons.Validate;
import com.jg.apirest.APIREST.Fundation.Pet.Model.Mascota;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.*;

import java.util.Map;
import java.util.UUID;

@Repository
@Controller
public class CreatePet {
    public JdbcTemplate jdbcTemplate;

    public Validate validate;

    public CreatePet(JdbcTemplate jdbcTemplate, Validate validate) {
        this.jdbcTemplate = jdbcTemplate;
        this.validate = validate;
    }

    public void createPet(Mascota mascota){
        String sql = "INSERT INTO mascota VALUES(?,?,?,?);";
        PreparedStatementSetter setter = ps -> {
            ps.setInt(1,mascota.getId());
            ps.setString(2,mascota.getNombre());
            ps.setInt(3,mascota.getTipoMascota());
            ps.setInt(4,mascota.getPropietario());
        };
        validator(mascota);
        jdbcTemplate.update(sql,setter);
    }
    public void validator(Mascota mascota){
        validate.validate(mascota.getId());
        validate.validate(mascota.getNombre());
    }
}
