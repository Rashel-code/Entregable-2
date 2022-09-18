package upeu.edu.pe.clase01.daoImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Component;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.entity.Venta;


@Component
public class VentaDaoImpl implements Operaciones<Venta> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private DetalleDaoImpl daoImpl;
	
	@Autowired
	private DataSource dataSource;
	
	@Override
	public int create(Venta t) {
		// TODO Auto-generated method stub
		NamedParameterJdbcTemplate template = new NamedParameterJdbcTemplate(dataSource);
		
		GeneratedKeyHolder clavesGeneradas = new GeneratedKeyHolder();
		//Almacenar claves generadas
		String sql = "INSERT INTO ventas (fecha) values(:fecha)";
		Map<String, Object> designarClaves=new HashMap<>();
		//tabla basada en implementacion de claves unicas
		designarClaves.put("fecha", t.getFecha());
		
		template.update(sql, new MapSqlParameterSource(designarClaves), clavesGeneradas);
		int idGenerado = clavesGeneradas.getKey().intValue();
		t.getListaDetalles().forEach(x->{
			x.setIdventas(idGenerado);
			daoImpl.create(x);
		});
		return idGenerado; 
		
	}

	@Override
	public int update(Venta t) {
		// TODO Auto-generated method stub
		String SQL= "UPDATE ventas SET fecha = ? WHERE idventas = ?";
		return jdbcTemplate.update(SQL, t.getFecha(), t.getIdventas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL= "DELETE FROM ventas WHERE idventas = ?";
		return jdbcTemplate.update(SQL, id);

	}

	@Override
	public Venta read(int id) {
		// TODO 
		try {
			Venta v = jdbcTemplate.queryForObject("SELECT * FROM ventas WHERE idventas = ?", BeanPropertyRowMapper.newInstance(Venta.class), id );
			return v;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}
		
	}

	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM ventas", BeanPropertyRowMapper.newInstance(Venta.class));
	}
	@Override
	public List<Map<String , Object>> readAll2(){
		return null;	
	}
	
	

	
}
