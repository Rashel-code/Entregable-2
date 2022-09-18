package upeu.edu.pe.clase01.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.clase01.dao.Operaciones;
import upeu.edu.pe.clase01.daoImpl.InvoicesDaoImpl;
import upeu.edu.pe.clase01.entity.Invoices;
@Service
public class InvoicesService implements Operaciones<Invoices>{
	@Autowired
	private InvoicesDaoImpl daoImpl;

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
		return daoImpl.readAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}
