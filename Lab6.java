
import CIE.*;
import SEE.*;
import java.util.Scanner;

public class Lab6{
    public static void main(String []args){
        Scanner S = new Scanner(System.in);
        
        System.out.print("No of students ");
        int nosu = S.nextInt();    
        
        Internals cie[] = new Internals[nosu];
        Externals see[] = new Externals[nosu];
        
        int i_marks[] = new int[5];
        int s_marks[] = new int[5];
        String name;
        String usn;
        int sem;
        
        for (int i = 0; i < nosu; i++){
            System.out.println("Details of student "+(i+1));
            S.nextLine();
            System.out.print("Name ");
            name = S.nextLine();
            System.out.print("usn ");
            usn = S.nextLine();
            System.out.print("sem ");
            sem =S.nextInt();
            System.out.println("Enter CIE and SEE marks");
            for (int j= 0;j<5;j++){
                System.out.print("CIE mark of subject "+(i+1)+" ");
                i_marks[j]=S.nextInt();
                System.out.print("SEE mark of subject "+(i+1)+" ");
                s_marks[j]=S.nextInt();              
            }
            cie[i]=new Internals(usn, name, sem, i_marks);
            see[i]=new Externals(usn, name, sem, s_marks);
        }

        System.out.println("TOtal marks ");
        for(int i =0;i<nosu;i++){
            System.out.println("Marks of " + cie[i].name+", usn : "+cie[i].usn);
            for(int j=0;j<5;j++){
                int tmarks = cie[i].marks[j]+(see[i].marks[j]/2);
                System.out.println("In subject "+(i+1)+" "+ tmarks);
            }
        }
    }

}