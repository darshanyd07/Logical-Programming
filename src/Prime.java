import java.io.*;
public class Prime {
    public static void main(String[] darsh)throws IOException
    {
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter Number");
        int number = Integer.parseInt(d.readLine());
        int num = number/2;
        int counter = 0;
        if(number==0||number==1)
        {
            System.out.println("Not Prime Number :-"+number);
        }
        for(int i = 2;i<num;i++)
        {
            if(number%i == 0)
            {
                System.out.println("Not Prime Number :-"+number);
                counter++;
                break;
            }

        }
        if(counter==0)
        {
            System.out.println("Prime Number :-"+number);
        }
    }

}
