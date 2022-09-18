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
public class Detalle implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idDetalles;
	private double precio;
	private int cantidad;
	private int idProductos;
	private int idventas;
	
	public int getIdDetalles() {
		return idDetalles;
	}
	public void setIdDetalles(int idDetalles) {
		this.idDetalles = idDetalles;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public int getIdProductos() {
		return idProductos;
	}
	public void setIdProductos(int idProductos) {
		this.idProductos = idProductos;
	}
	public int getIdventas() {
		return idventas;
	}
	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
