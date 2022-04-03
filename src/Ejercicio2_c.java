import java.util.Scanner;

public class Ejercicio2_c {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        int numProblems = sc.nextInt();
        int minLlegar = sc.nextInt();
        int minTotal=240-minLlegar;
        int tiempoEjercicio=0;
        boolean salir=false;
        int contador=0;
        for(int i=1;i<numProblems && !salir;i++) {
        	tiempoEjercicio=i*5;
        	contador=i;
        	minTotal=minTotal-tiempoEjercicio;
        	if(minTotal<tiempoEjercicio) {
        		salir=true;
        		
        	}
        }
        if(salir==true) {
        	System.out.println(contador);
        }else {
        	System.out.println(contador+1);
        }
        
    }
}