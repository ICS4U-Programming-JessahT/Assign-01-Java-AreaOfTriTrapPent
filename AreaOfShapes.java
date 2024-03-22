import java.util.Scanner;

/**
 * Asks the user to choose trapezoid,triangle or pentagon to calc area.
 *
 * @author Jessah
 * @version 1.0 @2024-03-19
 */
public final class AreaOfShapes {

  /** Private constructor to prevent instantiation of this utility class. */
  private AreaOfShapes() {
    // whitespace
  }

  /**
   * Print message.
   *
   * @param args Command-line arguments (not used in program).
   */
  public static double triAreaNum(double triHeight, double triBase) {

    if (triHeight > 0 && triBase > 0) {

      final double area = 0.5f * (triHeight * triBase);

      System.out.print("The area of a triangle with a height of ");
      System.out.println(triHeight + " and base of " + triBase + " is " + area + "cm^2");

      return area;
    } else {
      System.out.println("Values must be positive");
      return 0;
    }
  }

  public static double trapAreaNum(double trapHeight, double trapBaseA, double trapBaseB) {

    if (trapHeight > 0 && trapBaseA > 0 && trapBaseB > 0) {
      final double area = 0.5f * (trapBaseA + trapBaseB) * trapHeight;

      System.out.print("The area of a trapezoid with a height of ");
      System.out.print(trapHeight + " and sides of " + trapBaseA + " and " + trapBaseB);
      System.out.println(" is " + area + "cm^2");
      return area;
    } else {
      System.out.println("Values must be positive.");
      return 0;
    }
  }

  public static double pentAreaNum(double pentHeight, double pentBase) {

    if (pentHeight > 0 && pentBase > 0) {
      final double area = 5 * (0.5 * (pentBase * pentHeight));

      System.out.print("The area of a pentagon with a height of ");
      System.out.println(pentHeight + " and the base of " + pentBase + " is " + area + "cm^2");

      return area;
    } else {
      System.out.println("Values must be positive.");
      return 0;
    }
  }

  public static void main(final String[] args) {
    // Create a scanner for input.
    final Scanner scanner = new Scanner(System.in);
    // Declaring userShape so it can be used.
    String userShape = "";

    // Greeting message.
    System.out.println("Calculating the Area of Shapes");
    System.out.print("Hello! This program calculates the area of ");
    System.out.println("a trapezoid, triangle, or pentagon in cm's.");

    // Loop until user wants to quit.
    while (!userShape.equals("q")) {

      // Get user input
      System.out.print("Which shape would you like to calculate? ");
      System.out.print("or type q to quit: ");
      // Assign userShape to input so it won't be an infinite loop.
      userShape = scanner.nextLine();

      // If user enters pentagon.
      if (userShape.equals("Pentagon") || userShape.equals("pentagon")) {
        try {
          System.out.print("Enter the height: ");
          final double pentHeight = Double.parseDouble(scanner.nextLine());

          System.out.print("Enter the base: ");
          final double pentBase = Double.parseDouble(scanner.nextLine());

          double userArea = pentAreaNum(pentHeight, pentBase);

        } catch (NumberFormatException error) {
          System.out.println("Invalid input");
        }
      } else if (userShape.equals("Triangle") || userShape.equals("triangle")) {
        // If user enters triangle.
        try {
          System.out.print("Enter the height: ");
          final double triHeight = Double.parseDouble(scanner.nextLine());

          System.out.print("Enter the base: ");
          final double triBase = Double.parseDouble(scanner.nextLine());

          double userArea = triAreaNum(triHeight, triBase);

        } catch (NumberFormatException error) {
          System.out.println("Invalid input");
        }

      } else if (userShape.equals("Trapezoid") || userShape.equals("trapezoid")) {
        // If user enters trapezoid.
        try {

          System.out.print("Enter the height: ");
          final double trapHeight = Double.parseDouble(scanner.nextLine());

          System.out.print("Enter the base A: ");
          final double trapBaseA = Double.parseDouble(scanner.nextLine());

          System.out.print("Enter the base B: ");
          final double trapBaseB = Double.parseDouble(scanner.nextLine());

          // call function
          double userArea = trapAreaNum(trapHeight, trapBaseA, trapBaseB);
        } catch (NumberFormatException error) {
          System.out.println("Invalid input");
        }

      } else if (userShape.equals("q")) {
      // If user wants to quit.
        scanner.close();
        System.out.println("Thanks for playing");
      } else {
      // If user enters an invalid input.
        System.out.println("Enter a valid shape");
      }
    }
  }
}
