import java.util.Scanner;

 class Student
{
    private final String usn, name;
    private final int credits[], marks[];
    public Student(String usn, String name, int nosub)
    {
        this.usn=usn;
        this.name=name;
        this.credits=new int[nosub];
        this.marks=new int[nosub];
    }
    Scanner S1= new Scanner(System.in);
    public void accept()
    {
        System.out.println("Enter your credists and MAkrks");

        for (int i=0;i<credits.length;i++)
        {
            System.out.print("Credits of "+ (i+1)+ " Subject : ");
            credits[i]=S1.nextInt();
            System.out.print("Marks of "+ (i+1)+ " Subject : ");
            marks[i]=S1.nextInt();
        }
    }
    public void dis()
    {
        System.out.println("Displaying results");
        System.out.println("USN "+usn);
        System.out.println("Name "+name);
        for (int i=0;i<credits.length;i++)
        {
            System.out.println("In Subject "+(i+1)+" of credits "+ credits[i] + " you got "+ marks[i]);
        }

    }
    public void sgpa()
    {
        int total=0;
        double sgpa=0 ;
        for (int i =0;i<credits.length;i++)
        {
            int g;
            if (marks[i]>=90) g = 10;
            else if (marks[i]>=80) g = 9;
            else if (marks[i]>=70) g = 8;
            else if (marks[i]>=60) g = 7;
            else if (marks[i]>=50) g = 6;
            else if (marks[i]>=40) g = 5;
            else if (marks[i]>=35) g = 4;
            else 
            {
                System.out.println("Fail ");
                return ;
            }
            sgpa += (credits[i]*g);
            total+=credits[i];
        }
        System.out.println("Your SGPA is " + (sgpa/total));
    }
}


public class Lab2 
{
   public static void main(String args[])
   { 
    
    Scanner S1 = new Scanner(System.in);
    System.out.println("Enter your usn ");
    String usn = S1.nextLine();
    System.out.println("Enter Your name ");
    String name = S1.nextLine();
    System.out.println("Enter Your no of subjects ");
    int nosub= S1.nextInt();
    Student S =new Student(usn, name, nosub);
    S.accept();
    S.dis();
    S.sgpa();
   }
}