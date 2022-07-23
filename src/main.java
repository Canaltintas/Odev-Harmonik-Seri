import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int n;
        double sum=0.0;
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz :");
        n=input.nextInt();
        for (int i=1;i<=n;i++){
            sum +=(1.0/i);
        }
        System.out.println(sum);
    }
}
