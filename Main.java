import java.util.Scanner;
public class Main {
    public  static  void main(String[] args){
        float sayi1,sayi2;
        int secim;

        Scanner input = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = input.nextFloat();

        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = input.nextFloat();

        System.out.println("Seçiminizi yapınız: ");
        secim = input.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam: "+ (sayi1+sayi2));
                break;
            case 2:
                if(sayi1>sayi2){

                System.out.println("Çıkarma: "+ (sayi1-sayi2));
                }
                else{
                    System.out.println("Çıkarma: "+ (sayi2-sayi1));
                }
                break;
            case 3:
                System.out.println("Çarpma: "+ (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Bölme: "+ (float)(sayi1/sayi2));

            default:
                System.out.println("Geçersiz seçim yaptınız.");
        }

    }
}
