import java.util.Scanner;

public class Ejercicio2_b {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            long n=sc.nextLong();
            long s=sc.nextLong();
            long mid=(n/2)+1;
            long respuesta=s/mid;
            System.out.println(respuesta);
        }
    }
}