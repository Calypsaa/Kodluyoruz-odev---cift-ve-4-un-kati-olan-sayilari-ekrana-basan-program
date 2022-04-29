import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;

        do {
            System.out.print("Bir sayi girin: ");
            sayi = scanner.nextInt();
            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        while (!(sayi % 2 == 1));

        System.out.println("Sayilarin toplami: " + toplam);
    }
}
