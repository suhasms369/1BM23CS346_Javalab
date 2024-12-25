import java.util.Scanner;

class relex extends Exception {
    public relex() {}
    public String toString() {
        return "Age can't be negative";
    }
}

class agex extends Exception {
    public agex() {}
    public String toString() {
        return "Son's age can't be greater than or the same as father's age";
    }
}

class father {
    public int age;

    public father(int age) throws relex {
        if (age < 0) {
            throw new relex();
        }
        this.age = age;
    }
}

class son extends father {
    public son(int fage, int sage) throws agex, relex {
        super(fage);
        if (fage <= sage) {
            throw new agex();
        }
        age = sage;
        System.out.println("Accepted details successfully");
    }
}

public class Lab7 {
    public static void main(String[] xx) {
        Scanner sx = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter details : 1. Yes 2. No");
                int ch = sx.nextInt();
                if (ch != 1) {
                    break; 
                }

                System.out.print("Enter father's age:");
                int fage = sx.nextInt();
                father f = new father(fage); 

                System.out.print("Enter son's age:");
                int sage = sx.nextInt();
                son s = new son(fage, sage);             
            } catch (relex ex) {
                
                System.out.println("Father's age error: " + ex);
            } catch (agex ex) {
                
                System.out.println("Son's age error: " + ex);
            }
        }
        sx.close();
    }
}
