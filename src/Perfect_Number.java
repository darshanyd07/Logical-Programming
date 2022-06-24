import javax.xml.crypto.Data;
import java.io.*;
public class Perfect_Number
{
    public static void main(String[] darsh)throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);

        System.out.println("Enter Number");
        int number = Integer.parseInt(d.readLine());
        int copy = number;
        int i = 1,sum = 0;
        while(i <= number/2)
        {
            if(number % i == 0)
            {
                sum = sum + i;
            }
            i++;
        }
        if(sum == copy)
        {
            System.out.println(number+" is a perfect number.");
        }
        else
        {
            System.out.println(number+" is a not perfect number.");
        }



    }
}
