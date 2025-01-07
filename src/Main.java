// Döngümüz kullanıcı doğru değeri girene kadar (yani en az bir kere) çalışması gerektiği için do-while döngüsünü kullanırız.
package random;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r=new Random();
        int rastgele=r.nextInt(10);
        int tahmin;
        System.out.println("1 ile 10 arasında bir sayı tuttum. Doğru sayıyı tahmin edin!");
        do {
            System.out.print("Tahmininizi girin: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Geçersiz giriş! Lütfen bir sayı giriniz.");
                System.out.print("Tekrar deneyin: ");
                scanner.next();
            }
            tahmin = scanner.nextInt();

            if(rastgele<tahmin){
                System.out.println("Daha küçük sayı deneyin.");
            }else if(tahmin<rastgele){
                System.out.println("Daha büyük sayı deneyin.");
            } else{
                System.out.println("Doğru sayıyı buldunuz:"+rastgele);
            }
        }while (tahmin!=rastgele);
        }

    }
