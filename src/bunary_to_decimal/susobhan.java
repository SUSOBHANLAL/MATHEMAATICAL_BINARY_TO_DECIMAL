package bunary_to_decimal;
import java.util.*;
public class susobhan {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the no to convert");
		int binary = sc.nextInt();
		int sum =0;
		int p =1;
		while(binary!=0){
			int rem = binary%10;
			 sum = sum+rem*p;
			 binary= binary/10;
			p = p*2;
			
		}
		System.out.print(" "+sum);
		
	}

}
