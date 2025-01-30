import java.util.Scanner; 
public class simpleCalc {
  public static void main(String[] args){
    System.out.print("Enter first number: ");
    Scanner scanner = new Scanner(System.in);
    int inputnum1 = scanner.nextInt();
    
    scanner.nextLine();

    System.out.print("+ to add, - to substract, * to multiply, / to divide: ");
    String inputCalc = scanner.nextLine();
    System.out.print("Enter second number: ");
    int inputnum2 = scanner.nextInt();

    if (inputCalc.equals("/")){
      System.out.println(inputnum1/inputnum2);
    }
    else if (inputCalc.equals("*")){
      System.out.println(inputnum1*inputnum2);

    }
    else if (inputCalc.equals("+")){
      System.out.println(inputnum1+inputnum2);

    }
    else if (inputCalc.equals("-")){
      System.out.println(inputnum1-inputnum2);

    }
    else{
      System.out.println("invalid entry");

    }
  }

}
