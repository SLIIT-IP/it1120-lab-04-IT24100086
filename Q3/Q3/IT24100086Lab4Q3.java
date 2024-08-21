import java.util.Scanner;

public class IT24100086Lab4Q3
{

  public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
   int number=scanner.nextInt();
   String result=(number>0)?"The number is positive":
                 (number<0)?"The number is negative":
                 "The number is zero.";
   
   System.out.println(result);
   scanner.close();
   }
}