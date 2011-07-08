import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import net.zemberek.yapi.Kelime;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

public class ZemberekTests {
    public static void heceler(String k, String[] dizi, Zemberek z) {

        int a = 0;
        while (a < dizi.length) {
            String[] hecelenmis = z.hecele(dizi[a]);
            System.out.println(">>>" + dizi[a]
                    + "  kelimesinin  hecelenmis hali:"
                    + Arrays.toString(hecelenmis));
            a++;
        }
        System.out.println("\n");
    }

    public static void asciDonustur(String k, Zemberek z) {
        String l = z.asciiyeDonustur(k);
        System.out.println(">>>Asci ya donusmus hali:");
        System.out.print(l);
        System.out.println("\n");
    }

    public static void oneriler(String dizi[], Zemberek z) {
        int b = 0;
        while (b < dizi.length) {
            String[] oneriler = z.oner(dizi[b]);
            System.out.println(">>>" + dizi[b] + " kelimesi icin oneriler:");
            for (int i = 0; i < oneriler.length; i++) {
                System.out.println(oneriler[i]);
            }
            b++;
        }
        System.out.println("\n");
    }

    public static void kelimeCozumle(String dizi[], Zemberek z) {
        int d = 0;
        while (d < dizi.length) {
            System.out.println(">>>" + dizi[d] + " için cozumlemeler:");
            Kelime[] cozumler = z.kelimeCozumle(dizi[d]);
            for (Kelime kelime : cozumler) {
                System.out.println(kelime);
            }
            d++;
        }
        System.out.println("\n");
    }

    public static void kelimeDenetle(String dizi[], Zemberek z) {
        int c = 0;
        while (c < dizi.length) {
            if (z.kelimeDenetle(dizi[c]))
                System.out
                        .println(">>>" + dizi[c] + " kelimesi doğru yazilmis");
            else
                System.out.println(">>>" + dizi[c]
                        + " kelimesi doğru yazilmamis");
            c++;
        }
        System.out.println("\n");
    }

    public static void kelimeAyristir(String dizi[], Zemberek z) {
        int h = 0;
        while (h < dizi.length) {
            System.out.println(">>>" + dizi[h] + " için ayristirma sonuclari:");
            List<String[]> ayrisimlar = z.kelimeAyristir(dizi[h]);
            for (String[] strings : ayrisimlar)
                System.out.println(Arrays.toString(strings));
            h++;
        }
    }

    public static void dosyadanOku() {
        Zemberek z = new Zemberek(new TurkiyeTurkcesi());
        Scanner n = new Scanner(System.in);
        Scanner q = new Scanner(System.in);
        BufferedReader oku;
        String adres;
        System.out.println("Adresi giriniz:");
        adres = n.nextLine();
        File dosya = new File(adres);
        String s = "";
        try {
            oku = new BufferedReader(new FileReader(dosya));
            while (oku.ready()) {
                s += oku.readLine();
            }
            oku.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        String dizi2[] = null;
        dizi2 = s.split(" ");
        System.out.println("Uygulanacak islemi secip numarasini giriniz:");
        System.out
                .print("1.Hecele\n2.Asciya donustur\n3.Kelime denetle\n4.Kelime cozumle\n5.Kelime ayristir\n6.Oneriler\n7.Hepsi :)");
        int l;
        l = q.nextInt();
        System.out.println("İslem yapilacak  cumle:" + s);
        switch (l) {
        case 1:
            heceler(s, dizi2, z);
            break;
        case 2:
            asciDonustur(s, z);
            break;
        case 3:
            kelimeDenetle(dizi2, z);
            break;
        case 4:
            kelimeCozumle(dizi2, z);
            break;
        case 5:
            kelimeAyristir(dizi2, z);
            break;
        case 6:
            oneriler(dizi2, z);
            break;
        case 7:
            heceler(s, dizi2, z);
            asciDonustur(s, z);
            oneriler(dizi2, z);
            kelimeDenetle(dizi2, z);
            kelimeCozumle(dizi2, z);
            kelimeAyristir(dizi2, z);
            break;

        }

    }

    public static void kullanicidanAl() {
        Zemberek z = new Zemberek(new TurkiyeTurkcesi());
        Scanner m = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        String k;
        System.out.println("lutfen cumleyi giriniz:");
        k = m.nextLine();
        String dizi[] = null;
        dizi = k.split(" ");
        System.out.println("Uygulanacak islemi secip numarasnı giriniz:");
        System.out
                .print("1.Hecele\n2.Asciya donustur\n3.Kelime denetle\n4.Kelime cozumle\n5.Kelime ayristir\n6.Oneriler\n7.Hepsi :)");
        int l;
        l = v.nextInt();
        System.out.println("İslem yapilacak  cumle:" + k);
        switch (l) {
        case 1:
            heceler(k, dizi, z);
            break;
        case 2:
            asciDonustur(k, z);
            break;
        case 3:
            kelimeDenetle(dizi, z);
            break;
        case 4:
            kelimeCozumle(dizi, z);
            break;
        case 5:
            kelimeAyristir(dizi, z);
            break;
        case 6:
            oneriler(dizi, z);
            break;
        case 7:
            heceler(k, dizi, z);
            asciDonustur(k, z);
            oneriler(dizi, z);
            kelimeDenetle(dizi, z);
            kelimeCozumle(dizi, z);
            kelimeAyristir(dizi, z);
            break;

        }
    }

    public static void main(String[] args) {

        System.out
                .println("Islem yapilacak cumleyi kullanicidan almak icin 1'i ,dosyadan okutmak icin 2'yi tuslayiniz.");
        Scanner x = new Scanner(System.in);
        int girdi = x.nextInt();
        if (girdi == 2) {
            dosyadanOku();

        } else if (girdi == 1) {
            kullanicidanAl();

        }
    }

}
