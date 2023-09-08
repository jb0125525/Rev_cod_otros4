package com.generation;
//importar scanner
import java.util.Scanner;

public class Codigo4 {

	//Mover todo dentro del metodo main
	public static void main(String[] args) {
		//Agregar system.in
		Scanner s = new Scanner(System.in);
	  
	  //turno del jugador 1, cambio a sysSystem.out.println

	  System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras):  ");
	  String j1 = s.next();
	  
	  
	  //turno del jugador 2, cambio a sysSystem.out.println
	  System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
	  String j2 = s.next();
	  
	//El scanner 2 no se utiliza
	//  Scanner s2 = new Scanner(System.in);
	  
	  
	  //eliminar un ")"que tenia de mas
	  if (j1 == j2) {
	    System.out.println("Empate");
	  } else {
		  //solo declarar variable
		  int g=2;
	    
	    //separar el switch para mas claridad
	    switch(j1) {
	      case "piedra":
	    	 //utilizar equals para las comparaciones de string
	        if (j2.equals("tijeras")) {
	          g = 1;
	          System.out.println("Gana el jugador " + g);
	        }
	        
	        //agregar el break del case1
	        break;

	      case "papel":
	        if (j2.equals("piedra")) {
	          g = 1;
	          System.out.println("Gana el jugador " + g);

	         //agregar una llave faltante
	        }
	      //agregar el break del case2
	        break;
	      case "tijera":
	        if (j2.equals("papel")) {
	          g = 1;
	          System.out.println("Gana el jugador " + g);

	        }
	        break;
	      default:
	    	  //falta sentencia por default
	    	
	    }
	    //Agregue el syso a cada caso porque al tenerlo aqui siempre mostraba
	    //g=2 por lo que siempre ganaba el jugador 2
	    //System.out.println("Gana el jugador " + g);
		
	
	
    }
	  }
}
