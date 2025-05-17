import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    int a[][][] = {{{1,2,3,4},{2,3,4,5}},{{1,2,3,4},{2,3,4,5}},{{1,2,3,4},{2,3,4,5}}};
	    System.out.println(a[1][1][3]);
	    for(int i = 0; i < 4; i++)
	    {
	        System.out.print(a[1][1][i]+ " ");
	    }
	}
}
