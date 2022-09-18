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

import upeu.edu.pe.clase01.entity.Detalle;
import upeu.edu.pe.clase01.service.DetalleService;

@RestController
@RequestMapping("/api/detalle")
public class DetalleController {
	@Autowired
	private DetalleService service;	
	@GetMapping("/all")
	public List<Detalle> readAll(){
		return service.readAll();
	}	
	@GetMapping("/{id}")
	public Detalle read(@PathVariable int id) {
		return service.read(id);
	}	
	@PostMapping("/Save")
	public int save(@RequestBody Detalle detalles) {
		return service.create(detalles);
	}	
	@PutMapping("/Update")
	public int update(@PathVariable int id,@RequestBody Detalle detalle) {
		Detalle d = service.read(id);
		d.setPrecio(100.5);
		d.setCantidad(100);	
		d.setIdProductos(id);
		d.setIdventas(id);		
		return service.update(d);
	} 
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id) {
		return service.delete(id);
	}
	
	
	
}
