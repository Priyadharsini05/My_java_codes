//not sure about the output

import java.util.*;
public class Main
{
    static int[] data = new int[10];
    
    static int hashfn(int a)
    {
        return a%10;
    }
    static void insert(int a)
    {
        int index;
        index = hashfn(a);
        while(data[index] != -1)
        {
            index = index + 1;
            if(index > 10)
            {
                int temp = index;
                temp = temp - 10;
                while(data[temp] != -1)
                {
                    temp = temp + 1;
                    index = temp;
                }
            }
            
        }
        

            data[index] = a;
        
    }
    static void display()
    {
        for(int i = 0; i < 10; i++)
        {
            if(data[i] != -1)
            {
                System.out.println("The element in "+i+" is: "+data[i]);
            }
            else
            {
                System.out.println("The element in "+i+" is empty");
            }
        }
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
		    data[i] = -1;
		}
		
		System.out.println("Enter the number of Integers:");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++)
		{
		    
		    System.out.println("Enter Integer: ");
		    int a = sc.nextInt();
		    insert(a);
		    
		}
		display();
	}
}
