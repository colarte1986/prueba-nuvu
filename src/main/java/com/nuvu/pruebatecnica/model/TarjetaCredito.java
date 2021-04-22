package com.nuvu.pruebatecnica.model;


public class TarjetaCredito {
	
	private String tipo;
	private String numeroTarjeta;
    private String fechaVencimiento;
    private String numeroSeguridad;
    
	public TarjetaCredito() {
		
	}

	public TarjetaCredito(String tipo, String numeroTarjeta, String fechaVencimiento, String numeroSeguridad) {
		super();
		this.tipo = tipo;
		this.numeroTarjeta = numeroTarjeta;
		this.fechaVencimiento = fechaVencimiento;
		this.numeroSeguridad = numeroSeguridad;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNumeroTarjeta() {
		return numeroTarjeta;
	}
	public void setNumeroTarjeta(String numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public String getNumeroSeguridad() {
		return numeroSeguridad;
	}
	public void setNumeroSeguridad(String numeroSeguridad) {
		this.numeroSeguridad = numeroSeguridad;
	}
    
    

}
