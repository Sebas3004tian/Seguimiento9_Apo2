import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio2_g {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> arr=new ArrayList<>();
		
        int num = sc.nextInt();  
        for(int i=0;i<num;i++) {
	        int c = sc.nextInt(); 
	        arr.add(c);
        }
        Collections.sort(arr);
        int menor=arr.get(0);
        int condicion=menor*2;
        int posMayorPosible=0;
        if(arr.get(num-1)>condicion) {
        	 int mayor=binSearchNumeroCercano(arr,condicion);
 	        posMayorPosible=num-(mayor+1);
        }
        System.out.println(posMayorPosible);
        
	}
	public static int binSearchNumeroCercano(ArrayList<Integer> arr,int goal) {
		int retorno=-1;
		int ini=0;
		int fin=arr.size()-1;
		int mid=0;
		boolean i=false;
		while(ini<=fin && !i) {
			mid=(fin+ini)/2;
			if(arr.get(mid)==goal) {
				retorno=mid;
				i=true;
			}else if(arr.get(mid)>goal) {
				fin=mid-1;
			}else if(arr.get(mid)<goal) {
				ini=mid+1;
			}
		}
		if(retorno==-1) {
			retorno=fin;
		}
		return retorno;
	}
}
