import java.io.*;
public class Fibonacci_Series
{
    public static void main(String[] darsh)throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        int num1 = 0, num2 = 1 , sum ;
        System.out.println("Enter Range You Want ");
        int number = Integer.parseInt(d.readLine());
        System.out.println(num1);
        for(int i=2;i<number;i++)
        {
            sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);
        }


    }

}
