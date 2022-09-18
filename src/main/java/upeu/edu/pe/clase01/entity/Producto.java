package upeu.edu.pe.clase01.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Producto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idProductos;
	private String nombre;
	private double precio;
	private String stock;
	
	public Producto() {
		super();
	}

	public Producto(int idProductos, String nombre, double precio, String stock) {
		super();
		this.idProductos = idProductos;
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}

	public int getIdProductos() {
		return idProductos;
	}

	public void setIdProductos(int idProductos) {
		this.idProductos = idProductos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getStock() {
		return stock;
	}

	public void setStock(String stock) {
		this.stock = stock;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
