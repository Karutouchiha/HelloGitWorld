import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = -1;
        boolean bool = true;
        int b = -1;

            System.out.print("Bitte geben sie eine Zahl ein:");
        try {
            a = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Ihre eingabe enhält nicht zugelasse Zeichen.");
        }
        System.out.print("Bitte geben sie einen operanten (- = false oder + = true) ein:");
        try {
            bool = scanner.nextBoolean();
        } catch (Exception ex) {
            System.out.println("Ihre eingabe enhält nicht zugelasse Zeichen.");
        }
        System.out.print("Bitte geben sie eine zweite Zahl ein:");
        try{
            b = scanner.nextInt();
        } catch (Exception ex) {
            System.out.println("Ihre eingabe enhält nicht zugelasse Zeichen.");
        }
        int e;
        if (bool)
        {
            e = a+b;
        }
        else
        {
            e = a-b;
        }
        System.out.print("Ihr Ergebnis:"+ e);


    }
}
