import java.util.Scanner;  
import java.util.Random; 
public class NumberGuessing {
  public static void main(String[] args){
    Random random = new Random();
    int answer = random.nextInt(101);
    int tries = 0;
    System.out.print(answer);
    System.out.print("Guess a number between 1-100: ");
    Scanner scanner = new Scanner(System.in);
    int inputInt = scanner.nextInt();
    tries++;
    if (inputInt>answer){
      System.out.println("Your guess is high");
    }
    else if (inputInt<answer){
      System.out.println("Your guess is low");
    }
    while (inputInt != answer){
      System.out.print("Guess a number between 1-100: ");
      inputInt= scanner.nextInt();
      if (inputInt>answer){
        System.out.println("Your guess is high");
      }
      else if (inputInt<answer){
        System.out.println("Your guess is low");
      }
      tries++;
    }
    System.out.println("Correct");
    System.out.println("it took you "+tries+" tries");

  }
  
}
