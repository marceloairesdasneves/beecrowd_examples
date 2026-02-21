import java.util.Scanner;

public class BEE1006 {
            public static void main(String[] args) {
                try (Scanner scanner = new Scanner(System.in)) {
                    int id = scanner.nextInt();
                    int hoursWorked = scanner.nextInt();
                    double hourlyWage = scanner.nextDouble();

                    double salary = hoursWorked * hourlyWage;

                    System.out.println("NUMBER = " + id);
                    System.out.printf("SALARY = U$ %.2f%n", salary);
                }
            }
        }


