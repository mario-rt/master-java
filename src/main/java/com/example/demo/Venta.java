package com.example.demo;

public class Venta {
	
	private int id;
	private long importe;
	private String tipo;
	
	
	public Venta () {};
	
	public Venta(int id, long importe, String tipo) {
		super();
		this.id = id;
		this.importe = importe;
		this.tipo = tipo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getImporte() {
		return importe;
	}

	public void setImporte(long importe) {
		this.importe = importe;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
 
	

}
