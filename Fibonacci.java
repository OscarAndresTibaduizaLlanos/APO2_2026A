import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){

        // Declarar Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a la secuencia Fibonacci");
        System.out.print("Ingrese la cantidad de números: ");
        
        int n = sc.nextInt();  // Leer cantidad

        int[] fib = new int[n];  // Crear arreglo

        // Valores iniciales
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;

        // Ciclo para generar la secuencia
        for (int i = 2; i < n; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        // Mostrar resultados
        System.out.println("Secuencia:");
        for (int i = 0; i < n; i++){
            System.out.print(fib[i] + " ");
        }

        
    }
}
