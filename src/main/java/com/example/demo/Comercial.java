package com.example.demo;

public class Comercial {
	
	private int id;
	private String nombre;
	private String apellido;
	private long salario;
	private long ventas;
	private long devoluciones;
	
	public Comercial() {
	}
	
	public Comercial(int id, String nombre, String apellido, long salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	
	public void ventas(){
		System.out.println("He vendido" + ventas);
	}
	
	public void devolucion(){
		System.out.println("He devuelto"+ devoluciones);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public long getSalario() {
		return salario;
	}
	public void setSalario(long salario) {
		this.salario = salario;
	}

	public long getVentas() {
		return ventas;
	}

	public void setVentas(long ventas) {
		this.ventas = ventas;
	}

	public long getDevoluciones() {
		return devoluciones;
	}

	public void setDevoluciones(long devoluciones) {
		this.devoluciones = devoluciones;
	}
	
	
	

}
