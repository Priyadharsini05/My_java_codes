import java.util.Random;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int d;
		List<Integer> a = new ArrayList<>(); //ArrayList - Class
		while(a.size() != 5)
		{
		    d = r.nextInt(10) + 1;
		    if(!a.contains(d)){
		        a.add(d);
		    }
		}
		//System.out.println(a);
		
		System.out.println("Enter the name of Player 1:");
		String Player1 = sc.nextLine();
		System.out.println("Enter the name of Player 2:");
		String Player2 = sc.nextLine();
		
		List<Integer> a1 = new ArrayList<>();
		List<Integer> a2 = new ArrayList<>();
		int s1 = 0, s2 = 0;
		int count1 = 0;
		int count2 = 0;
		for(int i = 0; i < 3; i++)
		{
		    System.out.println("Make your guess, Player 1");
		    int p1 = sc.nextInt();
		    while(a1.contains(p1) || a2.contains(p1))
		    {
		        System.out.println("Already Guessed. Make another Guess");
		        p1 = sc.nextInt();
		    }
		    a1.add(p1);
		    
		    if(a.contains(p1))
		    {
		        System.out.println("CORRECT");
		        count1++;
		    }
		    else
		    {
		        System.out.println("WRONG");
		    }
		    
		    System.out.println("Make your guess, Player 2");
		    int p2 = sc.nextInt();
		    while(a1.contains(p2) || a2.contains(p2))
		    {
		        System.out.println("Already Guessed. Make another Guess");
		        p2 = sc.nextInt();
		    }
		    a2.add(p2);
		    
		    if(a.contains(p2))
		    {
		        System.out.println("CORRECT");
		        count2++;
		    }
		    else
		    {
		        System.out.println("WRONG");
		    }
		}
		
		System.out.println("Guesses of Player 1:" + a1);
		System.out.println("Correct guesses: " + count1);
		System.out.println("Guesses of Player 2:" + a2);
		System.out.println("Correct guesses: " + count2);
		
		if(count1 > count2)
		{
		    System.out.println(Player1 + " won the match!!");
		}
		else if(count1 < count2)
		{
		    System.out.println(Player2 + " won the match!!");
		}
		else
		{
		    System.out.println("The match is DRAW!!");
		}
	}
}
