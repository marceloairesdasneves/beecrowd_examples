import java.util.*;

public class BEE1020 {
    public static void main(String[] args) {
        int numero = new Scanner(System.in).nextInt();
        System.out.println(numero / 365 + " ano(s)");
        System.out.println(numero % 365 / 30 + " mes(es)");
        System.out.println(numero % 365 % 30 + " dia(s)");
    }
}