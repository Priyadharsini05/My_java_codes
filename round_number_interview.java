import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> a = new ArrayList<>();
		a.add(n);
		while(true)
		{
		    n = round(n);
		    if(!(n == 1) && (a.contains(n)))
		    {
		        System.out.println("False");
		        break;
		    }
		    else
		    {
		        System.out.println("True");
		        break;
		    }
		    
		}
	}
	public static int round(int n)
	{
	    int sum = 0;
	    while(n > 0)
	    {
	        int r = n%10;
	        sum = sum + (r*r);
	        n = n/10;
	    }
	    sum = n;
	    return sum;
	}
}
