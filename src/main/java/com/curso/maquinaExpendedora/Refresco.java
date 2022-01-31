package com.curso.maquinaExpendedora;

public class Refresco {
	
 private String marca;
 private double precio;
 private int stock;
 

public void addRefresco(Refresco refresco) {

	System.out.println("usted ha elegido: " + marca);
	}

public void restarStock() {
	if (stock > 0) {
		stock --;		
	}

	
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(int precio) {
	this.precio = precio;
}
public int getStock() {
	return stock;
}
public void setStock(int stock) {
	this.stock = stock;
}
public Refresco(String marca, double d, int stock) {
	super();
	this.marca = marca;
	this.precio = d;
	this.stock = stock;
}


@Override
public String toString() {
	return "Refresco [marca=" + marca + ", precio=" + precio + ", stock=" + stock + "]";

	}
 	
}
