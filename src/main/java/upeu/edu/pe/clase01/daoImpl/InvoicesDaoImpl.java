package upeu.edu.pe.clase01.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.entity.Invoices;
@Component
public class InvoicesDaoImpl implements Operaciones<Invoices >{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Invoices t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Invoices t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Invoices read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Invoices> readAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT *FROM invoices";
		return jdbcTemplate.query(SQL, new BeanPropertyRowMapper<Invoices>(Invoices.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}
