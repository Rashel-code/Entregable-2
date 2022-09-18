package upeu.edu.pe.clase01.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import upeu.edu.pe.clase01.entity.Producto;
import upeu.edu.pe.clase01.service.ProductoService;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
	@Autowired
	private ProductoService service;
	@GetMapping("/all")
	public List<Producto> readAll(){
		return service.readAll();
	}
	@GetMapping("/{id}")
	public Producto read(@PathVariable int id) {
	return service.read(id);
	}
	@GetMapping("/Save")
	public int save(@RequestBody Producto producto) {
		return service.create(producto);
	} 
	@PutMapping("/Update")
	public int update(@PathVariable int id, @RequestBody Producto producto){
		Producto p = service.read(id);
		p.setNombre("Verduras");
		p.setPrecio(29.9);
		p.setStock("Habido");
		return service.update(p);	
	}
	@DeleteMapping("/del/{id}")
	public int save(@PathVariable int id) {
	return service.delete(id);
	}
	
	
	
}

