import java.util.Scanner;

public class IT24100086Lab4Q2 {
    
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("please enter exam marks(out of 100):");
    double examMarks = scanner.nextDouble();

   System.out.println("please enter lab submission marks(Out of 100):");
    double labMarks = scanner.nextDouble();
if(examMarks<0||examMarks>100||labMarks<0||labMarks>100){
System.out.println("Marks should be between 0 and 100.");
return;
}

System.out.println("Enter percentage for exam marks:");
double examPercentage = scanner.nextDouble();
System.out.println("Enter percentage for lab marks:");
double labPercentage = scanner.nextDouble();

if(examPercentage + labPercentage !=100){
System.out.println("The total percentage should add up to 100.");
return;
}
double finalMark = (examMarks * examPercentage /100) + (labMarks * labPercentage);
System.out.println("The final mark is:" +finalMark);
scanner.close();
  }
}

   

   