import java.util.Scanner;

public class IT24100086Lab4Q1 {
      
     public static void main (String[] args) {
     Scanner scanner=new Scanner(System.in);
 
    System.out.println("Enter a new number:");
    int number=scanner.nextInt();


    if (number > 0){
    System.out.println("Number is positive.");
    } else if (number <0){
    System.out.println("Number is negative.");
    } else {
    System.out.println("Number is zero.");
    }
 

    scanner.close();
      }

}