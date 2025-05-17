import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter the number:");
        int a = sc.nextInt();
       
		for(int i = 2; i<a; i++){
		  //System.out.println(i);

		    if(a % i == 0){
		        System.out.println("not a prime number");
		        break;
		    }
		    else{
		        System.out.println("prime number");
		        break;
		    }
		    
		    
		}
	}
}
