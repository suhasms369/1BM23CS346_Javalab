package CIE;

public class Internals extends Personal {
    public int marks[] = new int[5];

    public Internals(String usn, String name, int sem, int marks[]){
        super(usn,name,sem);
        this.marks=marks;
    }

}