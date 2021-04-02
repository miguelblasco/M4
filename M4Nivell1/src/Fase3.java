import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		double precioTotal = 0;
		int respuesta = 0;
		
		HashMap<Integer, String> menu= new HashMap<Integer, String>();
		
		menu.put(1, "Calçots");
		menu.put(2, "Sushi");
		menu.put(3, "Raviolli");
		menu.put(4, "Paella");
		menu.put(5, "Crema catalana");
		menu.put(6, "Helado");
		menu.put(7, "Agua");
		menu.put(8, "Zumo");
		menu.put(9, "Vino");	
		
		
		HashMap<Integer, Double> precioPlatos= new HashMap<Integer, Double>();
		
		precioPlatos.put(1, 20.0);
		precioPlatos.put(2, 25.0);
		precioPlatos.put(3, 10.0);
		precioPlatos.put(4, 35.0);
		precioPlatos.put(5, 6.0);
		precioPlatos.put(6, 4.0);
		precioPlatos.put(7, 1.15);
		precioPlatos.put(8, 2.25);
		precioPlatos.put(9, 18.35);
		
		
		System.out.println("¿Qué platos desea para comer?:\n");

        respuesta = -1;
         
        System.out.println(menu);
    	System.out.println(precioPlatos);
    	System.out.println();
         
        ArrayList<Integer> platos = new ArrayList<Integer>();
         
         while (respuesta != 0)
         {
             System.out.print("¿Deseas pedir alguna cosa más? (0 para salir): ");
           
             
             respuesta=entrada.nextInt();
             if (respuesta >= 1 && respuesta <= 9 ) {
            	 platos.add(respuesta);
             
             }else if (respuesta != 0) {
            	 System.out.print("\n");
            	 System.out.println("-->Introducir números entre 1 y 9 y 0 para salir: ");
            	 System.out.print("\n");
             }
         }
         System.out.print("\n");
         System.out.println("Platos solicitados:");
         
         
         for(int p:platos) {
			if (menu.containsKey(p) && precioPlatos.containsKey(p)) {
				System.out.println(menu.get(p) + " " + precioPlatos.get(p) + " €");
			
				precioTotal = precioTotal + precioPlatos.get(p);
			
			}else {
				System.out.println("El plato escogido no existe en el menú");
			}	 	
		}
		 System.out.println();
		 System.out.print(String.format("La factura total es: " + "%.2f", precioTotal) + " €");
		
		 entrada.close();		
	}	
}


