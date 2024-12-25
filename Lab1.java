import java.util.Scanner;

class Qudratic
{
    private final double a, b,  dis;

    public Qudratic(int a, int b, int c) 
    {
        this.dis = (b*b)-4*a*c;
        this.a = a;
        this.b = b;
    }

    public boolean check()
    {
        return (dis >= 0);        
    }

    public void result()
    {
        double sqrtDis = Math.sqrt(dis);
        double r1 = (-b + sqrtDis) / (2 * a);
        double r2 = (-b - sqrtDis) / (2 * a);
        System.out.println("Result 1 is : " + r1);
        System.out.println("Result 2 is : " + r2);

    }
    
}



public class Lab1{
    public static void main (String args[])
    {
        Scanner S1 =  new Scanner(System.in);
        System.out.print("Enter the Values of A,B,C : ");
        int a = S1.nextInt();
        int b = S1.nextInt();
        int c = S1.nextInt();
        
        if (a == 0)
        {
            System.out.println("Has 'A' is 0 Sol is NE ");
        }
        else 
        {
            Qudratic C1 = new Qudratic (a,b,c);
            if (C1.check()) 
                C1.result();
            else 
                System.out.println("THere are no real numbers ");
        }

    }
}