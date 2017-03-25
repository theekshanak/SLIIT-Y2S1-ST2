import java.io.BufferedReader;
 import java.io.InputStreamReader;
import java.io.IOException;

public class lab4{
	
	public static void main(String args[])throws IOException{
		double op,l,w,h;
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length??");
		l=Double.parseDouble(br.readLine());
		System.out.println("Enter Height??");
		h=Double.parseDouble(br.readLine());	
		System.out.println("Enter Width?");
		w=Double.parseDouble(br.readLine());
		op=l*w*h;
		System.out.println(op);
	}
	
}
