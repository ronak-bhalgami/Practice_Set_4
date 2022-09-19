
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