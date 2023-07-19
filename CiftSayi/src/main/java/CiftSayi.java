import java.util.Scanner;
public class CiftSayi {
    public static void main(String[] args) {
        int deger, bolen = 0, sum = 0, sonuc;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        deger = input.nextInt();

        for(int i=1; i <= deger; i++){
            if(i%3 == 0 && i%4 == 0){
                sum += i;
                bolen++;
            }
        }
        sonuc = sum / bolen;
        System.out.println("Girdiğiniz sayı ve 0 aralığındaki sayılardan 3 ve 4'ün katı olanların ortalaması: " + sonuc);
    }
}
