package upeu.edu.pe.clase01.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.entity.Detalle;

@Component
public class DetalleDaoImpl implements Operaciones<Detalle> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle t) {
		// TODO Auto-generated method stub
		String SQL ="INSERT INTO detalles(idventas, idProductos, precio, cantidad) VALUES (?,?,?,?)";
		return jdbcTemplate.update(SQL, t.getIdventas(), t.getIdProductos(), t.getPrecio(), t.getCantidad());
	}

	@Override
	public int update(Detalle t) {
		// TODO Auto-generated method stub
		String SQL = "UPDATE detalles SET precio = ? WHERE idDetalles = ?";
		return jdbcTemplate.update(SQL, t.getPrecio(), t.getCantidad(), t.getIdDetalles(), t.getIdProductos(), t.getIdventas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM detalle WHERE idDetalle = ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Detalle read(int id) {
		// TODO 
		try {
			Detalle d = jdbcTemplate.queryForObject("SELECT * FROM detalles WHERE idDetalles = ?", BeanPropertyRowMapper.newInstance(Detalle.class),id);
			return d;
		}catch(IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}
    
	@Override
	public List<Detalle> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM detalles", BeanPropertyRowMapper.newInstance(Detalle.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
