package com.curso.main;

import java.util.*;

import com.curso.maquinaExpendedora.Refresco;

public class Main {
	
	 private static final Scanner teclado = new Scanner(System.in); 
	 
	 
	public static void main(String[] args) {

		ArrayList<Refresco> maquina = new ArrayList<Refresco>();
		maquina.add(new Refresco("Fanta Limon", 210, 10));
		maquina.add(new Refresco("Agua", 100, 10));
		maquina.add(new Refresco("Coca Cola", 250, 10));
		maquina.add(new Refresco("Fanta Naranja", 220, 10));
		maquina.add(new Refresco("Kas limon", 220, 10));
		maquina.add(new Refresco("Kas naranja", 220, 10));
		maquina.add(new Refresco("Aquarius", 230, 10));
		maquina.add(new Refresco("Redbull", 200, 10));
		maquina.add(new Refresco("Cafe con leche", 130, 10));
		maquina.add(new Refresco("Nestea", 190, 10));

		desplegarOpciones(maquina);
		
		
		}
	public static void desplegarOpciones(ArrayList<Refresco> maquina) {}
		/*
	switch () {
	case 1:
		comprobarPrecio(maquina); // getPrecio
		break;
	case 2:
		pedirRefresco(maquina); // Comprobar dinero introducido y stock disponible
								// restarStock y añadir/quitar cambios a maquina
		break;
	case 3: 
	
		break;
	case 4:
		System.exit(0);
		break;
	}
	}
*/
	public static void mostrar(ArrayList<Refresco> maquina) {

		Iterator<Refresco> ref = maquina.iterator();
		while (ref.hasNext()) {
			Refresco refresco = ref.next();
			System.out.println(refresco.getStock());
			System.out.println(refresco.getMarca());
			System.out.println(refresco.getPrecio());
		}
	}

	public static void pedirRefresco(ArrayList<Refresco> maquina) {

		Iterator<Refresco> ref = maquina.iterator();
		Refresco refresco = ref.next();
		double precio = refresco.getPrecio();
		int stock = refresco.getStock();

		// AQUI TENGO QUE LEER EL REFRESCO Y RECORRERME EL ARRAYLIST PARA SELECCIONAR EL
		// QUE TOCA
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce refresco: ");
		String bebida = sc.next();
			
		// MIRAR EL STOCK DISPONIBLE Y LOS CAMBIOS DE LA MAQUINA
		mirarMonedas(maquina);
		if (stock <= 0) {
				System.out.println("Ese refresco esta agotado");
			}
		
		refresco.restarStock();
		System.out.println("Su compra se ha realizado correctamente");

	}
	  
   
     
public static void mirarMonedas(ArrayList<Refresco> maquina) {

	Iterator<Refresco> ref = maquina.iterator();
	Refresco refresco = ref.next();
	double precio = refresco.getPrecio();
    int centimos;
         
        do {
            System.out.print("Cantidad introducida (en céntimos): ");
            centimos = teclado.nextInt();
            if(centimos<precio){
                System.out.println("Cantidad insuficiente.");
            }
        } while (centimos<precio);
         
        if(centimos==precio){
            System.out.println("Has introducido la cantidad exacta.");
        } else {
            centimos -= precio;
            System.out.println("El cambio a devolver es el siguiente:");
            if(centimos/200>0){
                System.out.println("Monedas de 2 euros: "+ centimos/200);
                centimos %= 200;
            }
            if(centimos/100>0){
                System.out.println("Monedas de 1 euro: "+ centimos/100);
                centimos %= 100;
            }
            if(centimos/50>0){
                System.out.println("Monedas de 50 céntimos: "+ centimos/50);
                centimos %= 50;
            }
            if(centimos/20>0){
                System.out.println("Monedas de 20 céntimos: "+ centimos/20);
                centimos %= 20;
            }
            if(centimos/10>0){
                System.out.println("Monedas de 10 céntimos: "+ centimos/10);
                centimos %= 10;
            }
            if(centimos/5>0){
                System.out.println("Monedas de 5 céntimos:"+ centimos/5);
                centimos %= 5;
            }
            if(centimos/2>0){
                System.out.println("Monedas de 2 céntimos: " + centimos/2);
                centimos %= 2;
            }
            if(centimos>0){
                System.out.println("Monedas de 1 céntimo: " + centimos);
            }
        }
    }




	public static double comprobarPrecio(ArrayList<Refresco> maquina) {
		// getPrecio
		Iterator<Refresco> ref = maquina.iterator();
		Refresco refresco = ref.next();
		return refresco.getPrecio();
	}

	public static int comprobarStock(ArrayList<Refresco> maquina) {

		Iterator<Refresco> ref = maquina.iterator();
		Refresco refresco = ref.next();
		return refresco.getStock();

	}
}
