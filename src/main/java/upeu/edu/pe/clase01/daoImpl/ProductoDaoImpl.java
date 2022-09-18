package upeu.edu.pe.clase01.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.entity.Producto;

@Component
public class ProductoDaoImpl implements Operaciones<Producto>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Producto t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto t) {
		// TODO Auto-generated method stub
		String SQL ="UPDATE productos SET nombre= ? WHERE idProductos = ?";
		return jdbcTemplate.update(SQL, t.getNombre(), t.getPrecio(), t.getStock(), t.getIdProductos());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM productos WHERE idProductos= ?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Producto read(int id) {
		try {
			Producto p = jdbcTemplate.queryForObject("SELECT * FROM productos WHERE idProductos = ?", BeanPropertyRowMapper.newInstance(Producto.class), id);
			return p;
		}catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
	}

	@Override
	public List<Producto> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM productos", BeanPropertyRowMapper.newInstance(Producto.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
