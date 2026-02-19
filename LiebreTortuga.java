import java.util.Scanner;
public class LiebreTortuga {

	public static void main(String[] args) {
	//declarar las variables y constantes:
        Scanner sc = new Scanner(System.in);
        final int PASOS = 250;
        int pasos_totales_liebre = 0;
        int pasos_totales_tortuga = 0;
        int pasos_avance_liebre,pasos_avance_tortuga;
        
        //definir ciclo para pedir numero de pasos avanzados por cada uno:
        //incrementar el avance de cada uno
        //validar si alguno de los 2 llego
        //imprimir en pantalla quien gano, o si hubo empate.
     System.out.println("--La carrera de la liebre y la tortuga--");
//ciclo que pide el numero de pasos avanzados por cada uno
while(pasos_totales_tortuga < PASOS && pasos_totales_liebre < PASOS ){

System.out.println(" digite el numero de pasos avanzados por la liebre: ");
//incrementa el avance de la liebre
pasos_avance_liebre = sc.nextInt();
pasos_totales_liebre += pasos_avance_liebre;

System.out.println("digite el numero de pasos avanzados por la tortuga: ");
//incrementa el avance de la tortuga
pasos_avance_tortuga = sc.nextInt();
pasos_totales_tortuga += pasos_avance_tortuga;

//muestra los pasos totales avanzados de cada uno
System.out.println("pasos totales de la liebre:  " + pasos_totales_liebre);
System.out.println("pasos totales de la tortuga: " + pasos_totales_tortuga);
}
//Las condiciones para determinar el ganador o si hubo empate 
if(pasos_totales_liebre >= PASOS && pasos_totales_tortuga >= PASOS ){
    System.out.println("Es un empate! ");
} else if (pasos_totales_liebre >= PASOS) {
    System.out.println(" Gana la liebre!");
} else {
    System.out.println(" Gana la tortuga");
}
    
    
	
	    
	    
	    
	    

	
  }
}