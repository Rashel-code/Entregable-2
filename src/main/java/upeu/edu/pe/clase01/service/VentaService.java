package upeu.edu.pe.clase01.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.daoImpl.VentaDaoImpl;
import upeu.edu.pe.clase01.entity.Venta;

@Service
public class VentaService implements Operaciones<Venta> {
	
	@Autowired
	private VentaDaoImpl daoImpl;

	@Override
	public int create(Venta t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Venta t) {
		// TODO Auto-generated method stub
		return daoImpl.update(t);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoImpl.delete(id);
	}

	@Override
	public Venta read(int id) {
		// TODO Auto-generated method stub
		return daoImpl.read(id);
	}

	@Override
	public List<Venta> readAll() {
		// TODO Auto-generated method stub
		return daoImpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
