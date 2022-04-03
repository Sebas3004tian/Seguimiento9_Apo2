import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
        int numLibros = sc.nextInt(); 
        sc.nextLine();
        for(int i=0;i<numLibros;i++) {
        	int precio = sc.nextInt();
        	arr.add(precio);
        }
        Collections.sort(arr);
        int precioTotal = sc.nextInt();
	    if(arr.size()>2) {
	        boolean salir=false;
	        int mitadPrecio=precioTotal/2;
	        int posicionMid= binSearchNumeroCercano(arr, mitadPrecio);
	        int MidPrecio=arr.get(posicionMid);
	        arr.remove(posicionMid);
	        int contador=0;
	        while(!salir) {
            	int precioSegundo=precioTotal-MidPrecio;
            	int index = binSearch(arr, precioSegundo);
        		if(index!=-1) {
        			System.out.println("Peter should buy books whose prices are "+MidPrecio+" and "+arr.get(index)+".");
        			System.out.println();
            		salir=true;
        		}else {
        			posicionMid= binSearchNumeroCercano(arr, MidPrecio);
        			MidPrecio=arr.get(posicionMid);
        			arr.remove(posicionMid);
        		}
	        	if(contador==arr.size()) {
	        		salir=true;
	        	}
	        	contador++;
	        }
	    
	    }else {
	    	if(arr.get(0)+arr.get(1)==precioTotal) {
	    		System.out.println("Peter should buy books whose prices are "+arr.get(0)+" and "+arr.get(1)+".");
	    		System.out.println();
	    	}
	    }
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
	public static int binSearch(ArrayList<Integer> arr,int goal) {
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
		return retorno;
	}
}

