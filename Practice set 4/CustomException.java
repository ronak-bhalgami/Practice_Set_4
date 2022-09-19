//This program is done by Ronak Bhalgami(21CE009)
import java.util.Scanner;

class MyException extends Exception
{
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Radius can't be negative!";
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Radius can't be negative!";
    }
}
public class CustomException 
{
        public static double area(double r) throws MyException
        {
            if(r<0)
            {
                throw new MyException();
            }
            double result = Math.PI * r * r;
            return result;
        }
        public static void main(String[] args) {
            System.out.print("Enter the radius of circle : ");
            Scanner sc = new Scanner(System.in);
            double radius=sc.nextDouble();
            try
            {
                double Ar=area(radius);
                System.out.println("Area = "+Ar);
            }
            catch(MyException e)
            {
                System.out.println("Exception...");
                System.out.println(e);
            }
        }
}        

