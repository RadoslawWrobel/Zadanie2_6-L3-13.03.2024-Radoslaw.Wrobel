import java.util.Scanner;
import java.lang.Math;
import java.util.InputMismatchException;

public class Main {
  public static void main(String[] args) {
    Scanner SkanerLiczbyPierwszej = new Scanner(System.in);
    System.out.println("Wprowadz liczbe do sprawdzenia: ");
    int liczba = SkanerLiczbyPierwszej.nextInt();

    boolean czyPierwsza = true;
    for (int i = 2; i < liczba; i++) {
      if (liczba % i == 0) {
        czyPierwsza = false;
        break;
      }
    }

    if (czyPierwsza) {
      System.out.println("Liczba " + liczba + " jest liczba pierwsza");
    }
    else
    {
      System.out.println("Liczba " + liczba + " nie jest liczba pierwsza");
    }
    SkanerLiczbyPierwszej.close();
  }
}