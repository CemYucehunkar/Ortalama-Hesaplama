package Giris;
import java.util.Scanner;
public class Baslangic {
    public static void main(String[] args) {
        //Değişkenleri ekleyelim

        int mat,turkce,fizik,kimya,tarih,muzik;

        //Scanner sınıfımızı tanımlayalım
        Scanner inp = new Scanner(System.in);

        //Kullanıcı Değerlerini Al
        System.out.print("Matemematik Notunu Girin: ");
        mat = inp.nextInt();
        System.out.println(mat);

        System.out.print("Fizik Notunuzu Girin:");
        fizik=inp.nextInt();
        System.out.println(fizik);

        System.out.print("Türkçe Notunu Giriniz");
        turkce=inp.nextInt();
        System.out.println(turkce);

        System.out.print("Tarih Notunuzu Giriniz");
        tarih=inp.nextInt();
        System.out.println(tarih);

        System.out.print("Kimya Notunuzu Girin");
        kimya=inp.nextInt();
        System.out.println(kimya);

        System.out.print("Müzik Notunuzu Girin");
        muzik=inp.nextInt();
        System.out.println(muzik);

        System.out.print("Ortalama Notunuz");
        int toplam=(mat+turkce+fizik+muzik+kimya);
        double sonuc=(toplam/6.0);
        System.out.println(sonuc);

        String sinifDurum=sonuc>60 ?"Sınıfı Geçtiniz":"Sınıfı Geçemediniz";
        System.out.print(sinifDurum);


    }
}
