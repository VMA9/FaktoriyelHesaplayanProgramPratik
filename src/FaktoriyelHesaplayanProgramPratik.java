import java.util.Scanner;

public class FaktoriyelHesaplayanProgramPratik {
    public static void main(String[] args) {
        int loop = 1;
        int loop2 = 1;
        int loop3 = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini giriniz : ");
        int n = input.nextInt();

        System.out.print("r değerini giriniz : ");
        int r = input.nextInt();

        if (n < r) {
            System.out.println("n değeri r'den büyük olmalıdır.  Tekrar deneyiniz. ");
        } else {

            for (int i = 1; i <= n; i++) {
                loop = loop * i;
            }

            for (int j = 1; j <= r; j++) {
                loop2 = loop2 * j;
            }

            for (int k = 1; k <= (n - r); k++) {
                loop3 = loop3 * k;
            }

            int comb = loop / (loop2 * loop3);
            System.out.println("C(" + n + "," + r + ") = " + comb);
        }
    }
}