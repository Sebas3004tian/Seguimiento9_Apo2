import java.util.Scanner;

public class Ejercicio2_d {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numCases = sc.nextInt();
		int [] output = new int[numCases];
		
		sc.nextLine();
		
		for(int i=0; i<numCases; i++) {
			
			String set = sc.nextLine();
			String[] split = set.split(" ");
			
			int prog = Integer.valueOf(split[0]);
			int math = Integer.valueOf(split[1]);
			int result;
			
			if(prog == math) {
				result = (prog+math)/4;
				output[i] = result;
			
			} else if(prog < math) {
				
				result = math-prog;
			    math = (math - result);
			    result = (result)/2;
			    
			    if(prog < result) {
			        result = prog;
			    }
			        
		        prog = (prog-result);
		        math = (math -result);
		        result += (prog+math)/4;
		        
		        output[i] = result;
				
				
		        
			} else {
				
				result = (prog - math);
		        prog = (prog -result);
		        result = (result/2);
		        
		        if(prog < result) {
		        	result = prog;
		        }
		        
		        prog = (prog - result);
		        math = (math - result);
		        result += (prog+math)/4;
		        
		        output[i] = result;
				
			}
		
			
		}
		
		sc.close();

		for (int i=0; i<numCases; i++) {
			System.out.println(output[i]);
		}
			
		
	}
}
