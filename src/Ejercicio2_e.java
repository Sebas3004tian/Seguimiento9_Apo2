import java.util.Scanner;

public class Ejercicio2_e {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();   
        double solution=0;
        String print="";
        for(int i=0;i<num;i++) {
        	
	        int a = sc.nextInt(); 
	        int b = sc.nextInt(); 
	        int c = sc.nextInt(); 
	        int k = sc.nextInt(); 
	        c=c-k;
	        solution=Math.ceil(((Math.sqrt((b*b)-(4*a*c))-b)/(2*a)));
        	print=print+(int)solution+"\n";
        }
        System.out.println(print); 
	}
}
