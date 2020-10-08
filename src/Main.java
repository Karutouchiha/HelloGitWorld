import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = -1;
        boolean bool = true;
        int b = -1;
        while (a== -1 && b == -1){
            System.out.print("Bitte geben sie eine Zahl ein:");
            try {
                Scanner scanner = new Scanner(System.in);
                a = scanner.nextInt();
            } catch (Exception ex) {
                System.out.println("Ihre eingabe enhält nicht zugelasse Zeichen.");
            }
            System.out.print("Bitte geben sie einen operanten (- = false oder + = true) ein:");
            try {
                Scanner scanner = new Scanner(System.in);
                bool = scanner.nextBoolean();
            } catch (Exception ex) {
                System.out.println("Ihre eingabe enhält nicht zugelasse Zeichen.");
            }
            System.out.print("Bitte geben sie eine zweite Zahl ein:");
            try {
                Scanner scanner = new Scanner(System.in);
                b = scanner.nextInt();
            } catch (Exception ex) {
                System.out.println("Ihre eingabe enhält nicht zugelasse Zeichen.");
            }
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
