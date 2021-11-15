package com.jg.apirest.APIREST.Fundation.Pet.Controller;

import com.jg.apirest.APIREST.Fundation.Pet.Model.Mascota;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Repository
public class ControllerPet {

    private final NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    private final JdbcTemplate jdbcTemplate;

    public ControllerPet(NamedParameterJdbcTemplate namedParameterJdbcTemplate, JdbcTemplate jdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Mascota> listDB() {
        String sql = "SELECT * FROM mascota;";
        return jdbcTemplate.query(sql, this::getMascota);
    }

    private Mascota getMascota(ResultSet resultSet, int rowNum)throws SQLException {
        int id = resultSet.getInt("idmascota");
        String nombre = resultSet.getString("nombre");
        int tipoMascota = resultSet.getInt("tipo_mascota");
        int propietario = resultSet.getInt("propietario");
        return new Mascota(id, nombre, tipoMascota,propietario);
    }

    public Optional<Mascota> filterUserById(UUID id){
        String sql = "SELECT * FROM mascota WHERE id = ?;";
        PreparedStatementSetter setter = ps -> ps.setString(1, id.toString());
        List<Mascota> usuarios = jdbcTemplate.query(sql, setter, this::getMascota);
        Mascota unsafeMascota = DataAccessUtils.singleResult(usuarios);
        return Optional.ofNullable(unsafeMascota);
    }

}
