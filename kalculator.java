
import java.util.Scanner; 

public class kalculator {

	static int b = 10;
	static int commands (int a)
    {
		
		if (a == b)
        {
            a = 1;
            return a;        
        }
        else if (a<b)
		{
            a = commands(a+1) + commands(a*2);
            return a;
		}
        else 
		{ 
            a = 0;
            return a;
		}
    }
        public static void main(String[] args) 
    {
        Scanner con = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = con.nextInt();
        System.out.println ("Число А: " + a + "\n" + "Число B: " + b + "\n" + "Количество команд преобразования числа А в число В: " + commands(a));
        con.close();
    }
}

