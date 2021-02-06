import java.util.Scanner;

public class PrintTests
{
  public static void main(String[] args)
  {
    int number;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter an integer value: ");
    number = keyboard.nextInt();

    System.out.println("You typed: " + number);

  }
}