package com.fernandopaniagua.demo.modelo;

/**
 * Representa un cliente
 * 
 * @author Fernando Paniagua
 *
 */
public class Cliente {
	/**
	 * Representa un número mágico
	 */
	public static int numeroMagico = 3;
	/**
	 * Devuelve un número mágico
	 * 
	 * @param entrada
	 * @return
	 * @throws ArrayIndexOutOfBoundsException
	 */
	public static int getNumeroMagico(int entrada) throws ArrayIndexOutOfBoundsException {
		return entrada * numeroMagico ;
	}
	/**
	 * Genera un número mágico
	 * 
	 * @return Un número mágico (el 3)
	 * @deprecated El método getNumeroMagico ya tiene su progio generador de números mágicos
	 */
	public int generarNumeroMagico() {
		return 3;
	}

}
