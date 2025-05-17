import java.util.Queue;
import java.util.LinkedList;
public class Main
{
    public static void calculate(int[] tasks, int time)
    {
        Queue<Integer> n = new LinkedList<>();
        int sum = 0;
        for(int i:tasks)
        {
            n.add(i);
        }
        while(!n.isEmpty())
        {
            
            int temp = n.poll();
            if(temp > time)
            {
                temp = temp - time;
                sum = sum + time;
                n.add(temp);
            }
            else
            {
                sum = sum + temp;
            }
        }
        System.out.println(sum);
    }
	public static void main(String[] args) 
	{
		int[] tasks = {10, 4, 2, 6};
		int time = 3;
		calculate(tasks, time);
	}
}
