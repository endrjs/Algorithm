package src.InputAndOutput;
import java.util.*;

public class AMinusB {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a<0 || b >10){
			System.out.println(" A must be bigger than 0 or b Must be less than 10");
			return;
		}
		System.out.println(a-b);
	}

}
