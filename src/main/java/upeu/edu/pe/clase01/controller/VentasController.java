package upeu.edu.pe.clase01.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.clase01.entity.Venta;
import upeu.edu.pe.clase01.service.VentaService;

@RestController
@RequestMapping("/api/venta")
public class VentasController {
	
	@Autowired
	private VentaService service;
	
	@PostMapping("/add")
	public int create(@RequestBody Venta venta){
		return service.create(venta);}
	
	
	@GetMapping("/all")
	public List<Venta> readAll(){
		return service.readAll();
	}
	
	@GetMapping("/{id}")
	public Venta read(@PathVariable int id){
		return service.read(id);
	}
	
	
	@PutMapping("/Update")
	public int update(@PathVariable int id, @RequestBody Venta venta){
		Venta v = service.read(id); 
		v.setFecha("2022-09-15");
		return service.update(v);
	}
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id) {
		return service.delete(id);
	}
	
	
}




