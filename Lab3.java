import java.util.Scanner;


class Book{
    String name ;
    String author ;
    double price ;
    int no_pages ;

    public Book(){};

    public Book(String name, String author, double price, int no_pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.no_pages = no_pages;        
    }

    public void setit(String name, String author, double price, int no_pages){
        this.name = name;
        this.author = author;
        this.price = price;
        this.no_pages = no_pages;
    }

    public void getit(){
        System.out.println("Name of book is "+ name);
        System.out.println("Author is "+author);
        System.out.println("of price "+ price);
        System.out.println("num of pages "+no_pages);
    }

    @Override
    public String toString(){
       return name + " written by "+ author+ " of price "+ price+" contains "+no_pages+" pages"; 
    }
}


public class Lab3 {
    
    public static void main(String [] args){
        Scanner S = new Scanner(System.in);
        String bname, author;
        double price;
        int no_pages;
        System.out.print("Enter the no of books ");
        int n = S.nextInt();
        Book A[] = new Book[n];
        S.nextLine();
        
        for(int i =0; i<n; i++){
            System.out.println("details of book "+(i+1));
            System.out.print("Enter the name of the book ");
            bname = S.nextLine();
            System.out.print("Enter the Author of the book ");
            author=S.nextLine();
            System.out.print("Enter the price of the book ");
            price=S.nextDouble();
            System.out.print("Enter Number of Pages of the book ");
            no_pages=S.nextInt();
            A[i]=new Book(bname,author,price,no_pages);
            S.nextLine();
        
        }

        for(int i = 0;i<n;i++){
            A[i].getit();
        }

        for(int i=0; i<n;i++){
            System.out.println(A[i].toString());
        }

    }
}
