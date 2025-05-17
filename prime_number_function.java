import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(prime(a));
	}
	public static String prime(int a){
	    for(int i = 2; i<a; i++){
		  //System.out.println(i);

		    if(a % i == 0){
		        
		        return "not a prime number";
		    }
		   
	    }
	    return "prime number";
	}
}
