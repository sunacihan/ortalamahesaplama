import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //if bloğu kullanmadan ortalamanın 60 dan büyük küçük olma durumu
        Scanner input= new Scanner(System.in);
        System.out.print("Ortalamayı giriniz:");
        int ort=input.nextInt();
        String sonuc=(ort>=60)?"Sınıfı geçti":"Sınıfta kaldı";
        System.out.println(sonuc);
    }
}