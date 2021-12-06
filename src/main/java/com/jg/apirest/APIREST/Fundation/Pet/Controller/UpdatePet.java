package com.jg.apirest.APIREST.Fundation.Pet.Controller;

import com.jg.apirest.APIREST.Fundation.Pet.Model.Mascota;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
@Repository
public class UpdatePet {
    private final JdbcTemplate jdbcTemplate;

    public UpdatePet(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void updatePet(Mascota mascota){
        String sql = "UPDATE mascota SET nombre=?, tipo_mascota=?, propietario=? WHERE idmascota=?;";
        PreparedStatementSetter setter = ps -> {
            ps.setString(1,mascota.getNombre());
            ps.setInt(2,mascota.getTipoMascota());
            ps.setInt(3,mascota.getPropietario());
            ps.setInt(4,mascota.getId());
        };
        jdbcTemplate.update(sql,setter);
    }
}
