package upeu.edu.pe.clase01.entity;

import java.io.Serializable;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Venta implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idventas;
	private String fecha;
	private List<Detalle> listaDetalles;
	
	
	public Venta() {
		super();
	}


	public Venta(int idventas, String fecha, List<Detalle> listaDetalles) {
		super();
		this.idventas = idventas;
		this.fecha = fecha;
		this.listaDetalles = listaDetalles;
	}


	public int getIdventas() {
		return idventas;
	}


	public void setIdventas(int idventas) {
		this.idventas = idventas;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public List<Detalle> getListaDetalles() {
		return listaDetalles;
	}


	public void setListaDetalles(List<Detalle> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	
	
}
