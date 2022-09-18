package upeu.edu.pe.clase01.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.entity.customers;

@Component
public class CustomersDaoImpl implements Operaciones<customers> {

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(customers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public customers read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<customers> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select *from customers", new BeanPropertyRowMapper<customers>(customers.class));
	}

	
	
}
