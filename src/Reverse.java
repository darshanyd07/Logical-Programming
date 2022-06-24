import java.io.*;
public class Reverse {
    public static void main(String[] darsh)throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter Number");
        int number = Integer.parseInt(d.readLine());
        int reverse = 0;

        while(number != 0)
        {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}


