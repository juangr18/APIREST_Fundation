package com.jg.apirest.APIREST.Fundation.Pet.Controller;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Controller
@Repository
public class DeletePet {
    private final JdbcTemplate jdbcTemplate;

    public DeletePet(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void DeletePetById(String id){
        String sql="DELETE FROM mascota WHERE idmascota=?;";
        PreparedStatementSetter setter=ps -> ps.setString(1,id);
        jdbcTemplate.update(sql,setter);
    }

}
