import java.util.Stack;
public class Main
{
    public static int precen(char ch)
    {
        switch(ch)
        {
            case '+':
            case '-': return 1;
            case '/':
            case '*': return 2;
        }
        return 0;
    }
    public static int process(int n1, int n2, char ch)
    {
        switch(ch)
        {
            case '+': return n1+n2;
            case '-': return n1-n2;
            case '/': return n1/n2;
            case '*': return n1*n2;
        }
        return -1;
    }
    public static int eval(String exp)
    {
        Stack<Integer> nums = new Stack<>();
        Stack<Character> symbol = new Stack<>();
        int i = 0;
        while(i < exp.length())
        {
            if(Character.isDigit(exp.charAt(i)))
            {
                
                int n = 0;
                while(i < exp.length() && Character.isDigit(exp.charAt(i)))
                {
                    n = (n * 10) + ((exp.charAt(i)) - '0');
                    i++;
                }
                nums.push(n);
            }
            else
            {
                while(!symbol.isEmpty() && precen(symbol.peek()) >= precen(exp.charAt(i)))
                {
                    char ch = symbol.pop();
                    int n1 = nums.pop();
                    int n2 = nums.pop();
                    nums.push(process(n1, n2,ch));
                }
                
                symbol.push(exp.charAt(i));
                i++;
            }
            
        }
        while(!symbol.isEmpty())
        {
                    char ch = symbol.pop();
                    int n1 = nums.pop();
                    int n2 = nums.pop();
                    nums.push(process(n1, n2,ch));
        }
        return nums.pop();
    }
	public static void main(String[] args) 
	{
		System.out.println(eval("100/5-12+4"));
		System.out.println(eval("10-7*12-2"));
	}
}
