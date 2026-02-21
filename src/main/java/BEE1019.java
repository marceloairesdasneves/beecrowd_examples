import java.util.Scanner;

public class BEE1019 {
    //Read an integer value, which is the duration in seconds of a certain event in a factory, and print how many hours, minutes and seconds it corresponds to, in the format "hh:mm:ss".
    // Consider that a day has 24h, a hour has 60min and a minute has 60s.

    public static void main(String[] args) {
        int n, h, m, s;

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        h = n / 3600;
        m = (n % 3600) / 60;
        s = (n % 3600) % 60;
        System.out.printf("%d:%d:%d\n", h, m, s);
    }
}
