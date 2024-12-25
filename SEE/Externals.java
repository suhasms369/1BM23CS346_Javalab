package SEE;
import CIE.Personal;

public class Externals extends Personal{
    public int marks[]=new int[5];

    public Externals(String usn, String name, int sem, int marks[]){
        super(usn,name,sem);
        this.marks=marks;
    }
}
