package upeu.edu.pe.clase01.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoices implements Serializable{
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private int id;
private int order_id;
private String invoice_date;
private String due_date;
private double tax;
private double shipping;
private double amount_due;
}
