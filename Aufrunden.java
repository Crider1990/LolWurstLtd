package aufrunden;

import java.util.Scanner;

public class Aufrunden {

    public static void main(String[] args) {
        
        System.out.println("Bitte geben Sie eine Zahl ein!");

        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num % 100 > 50);
        num = num + num % 100;
        if (num % 100 < 50);
        num = num - num % 100;

        System.out.println("Ergebnis:"+num);
    }
}
