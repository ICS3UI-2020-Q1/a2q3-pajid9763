import java.util.Scanner;
/**
 * program to find the order of ascension between two integers
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  // ask the user for two integers
  System.out.println("Please enter an integer:");
  int a = input.nextInt();
  System.out.println("Please enter another integer:");
  int b = input.nextInt();

  // find the order of ascension 
  if (a > b || a == b){
    System.out.println("Your numbers in ascending order are " + b + ", " + a);
  }else if (b > a || b == a){
    System.out.println("Your numbers in ascending order are " + a + ", " + b);
  }

    
  }
}
