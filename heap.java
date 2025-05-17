import java.util.PriorityQueue;
import java.util.Collections;
public class Main
{
	public static void main(String[] args) 
	{
		PriorityQueue<Integer> x = new PriorityQueue<>();
		PriorityQueue<Integer> x1 = new PriorityQueue<>(Collections.reverseOrder());
		int[] a = {1,2,4,12,3,56,22,78,90,23};
		for(int i:a)
		{
		    x.add(i);
		    x1.add(i);
		}
		
		System.out.println("Min heap:" + x);
		System.out.println("Max Heap:" + x1);
		
		System.out.println("Elements in sorted order: ");
		while(!x.isEmpty())
		{
		    
		    System.out.print(x.poll() + " ");//x.poll() - remove an element
		}
		
		System.out.println();
		System.out.println("Elements in reverse order: ");
		while(!x1.isEmpty())
		{
		   
		    System.out.print(x1.poll() + " "); 
		}
	}
}
