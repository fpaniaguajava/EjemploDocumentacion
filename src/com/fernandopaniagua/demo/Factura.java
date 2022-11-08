package com.fernandopaniagua.demo;

/**
 * Representa una <a href="https://es.wikipedia.org/wiki/Factura" target="_blank">factura</a> en el sistema.
 * 
 * @author Fernando Paniagua
 * @version 1.1
 * @since 1.0
 */
public class Factura {
	private String numeroFactura;
	private String nombreCliente;
	private String cifCliente;
	private float importe;
	/**
	 * Constructor
	 * 
	 * @param numeroFactura El número de la factura
	 * @param nombreCliente El nombre del cliente
	 * @param cifCliente El CIF del cliente
	 * @param importe El importe final de la factura
	 */
	public Factura(String numeroFactura, String nombreCliente, String cifCliente, float importe) {
		super();
		this.numeroFactura = numeroFactura;
		this.nombreCliente = nombreCliente;
		this.cifCliente = cifCliente;
		this.importe = importe;
	}
	/**
	 * Permite obtener el número de factura
	 * @return El número de la factura.
	 */
	public String getNumeroFactura() {
		return numeroFactura;
	}
	public void setNumeroFactura(String numeroFactura) {
		this.numeroFactura = numeroFactura;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getCifCliente() {
		return cifCliente;
	}
	public void setCifCliente(String cifCliente) {
		this.cifCliente = cifCliente;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	/**
	 * Calcula el IVA sobre el importe total.
	 * @return El importe del IVA.
	 */
	public float calcularIVA() {
		return 0;
	}
	/**
	 * Calcula el importe de descuento a partir de un porcentaje.
	 * @param porcentaje El porcentaje de descuento a aplicar.
	 */
	public void calcularDescuento(int porcentaje) {
		//No hacemos nada
	}
	/**
	 * Busca el límite de facturación.
	 * @throws NumberFormatException Se produce por indicar que el límite es 0.
	 */
	public void encontrarLimite() throws NumberFormatException {
		//No hacemos nada
	}
}
