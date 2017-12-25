import java.util.Scanner;

public class ScannerOut{
  public static void main(String[] args){

    String prompt = args[0];
    System.out.println(prompt);
    String userName;
    int userAge;
    Scanner sc = new Scanner(System.in);
    userName = sc.nextLine();
    userAge  = sc.nextInt();


     System.out.println("Your age is: " + userAge + "\n" + "Your name is: " + userName);
  }
}
