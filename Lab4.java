import java.util.Scanner;
abstract class Shape{
    int a ,b;
    public Shape(int a, int b){
        this.a = a;
        this.b = b;
    }
    abstract void printArea();
}

class Rectangle extends Shape{
    public Rectangle(int a, int b){
        super(a,b);
    }
    void printArea(){
        double area = a*b;
        System.out.println("Area of Rectangle is "+area);
    }
}

class Triangle extends Shape{
    public Triangle(int a, int b){
        super(a,b);
    }
    void printArea(){
        double area = 0.5*a*b;
        System.out.println("Area of Tirangle is "+area);
    }
}

class Circle extends Shape{
    public Circle(int a){
        super(a,a);
    }
    void printArea(){
        double area = Math.PI*a*a;
        System.out.println("Area of CIrcle is "+area);
    }
}

public class Lab4 {
    public static void main(String []args){
        Scanner S = new Scanner(System.in);
	System.out.print("Enter length and breath of rectangle ");
	int a = S.nextInt();
	int b = S.nextInt();
	Rectangle R = new Rectangle(a,b);
	System.out.print("Enter height and length of triangle ");
	a = S.nextInt();
	b =S.nextInt();
	Triangle T = new Triangle(a,b);
	System.out.print("Enter radius of the circle ");
	a = S.nextInt();
	Circle C = new Circle(a);
	
	R.printArea();
	T.printArea();
	C.printArea();
    }
}
