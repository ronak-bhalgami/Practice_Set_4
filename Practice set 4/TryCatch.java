//This program is done by Ronak Bhalgami(21CE009)
import java.util.Scanner;
public class TryCatch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ArithmeticException");
        try
        {
            int div=15/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("ArrayIndexOutOfBoundsException");
        try
        {
            int arr[]={1,2,3,4,5};
            System.out.println(arr[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("NumberFormatException");
        int number;
        try
        {
            System.out.print("Enter an integer : ");
            number=Integer.parseInt(sc.next());
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        System.out.println();
        System.out.println();
        System.out.println("IneruptedExeption");
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                try 
                {
                    Thread.sleep(-10);
                }
                catch (InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        });
        t1.setName("Test Thread");
        t1.start();
    }
}