import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name:");
    String name = scanner.next();

    System.out.println("Enter age:");
    int age = scanner.nextInt();

    System.out.println("Enter job title:");
    String jobTitle = scanner.next();

    System.out.println("Enter technology:");
    String technology = scanner.next();

    ITEmployee employee = new ITEmployee(name, age, jobTitle, technology);

    System.out.println("Employee created:");
    employee.displayEmployeeInfo();
  }
}

