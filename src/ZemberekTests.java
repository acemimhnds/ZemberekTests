import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import net.zemberek.yapi.Kelime;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.io.UnsupportedEncodingException;
import java.lang.String;

public class ZemberekTests {

	public static void heceler(String k, String dizi[], Zemberek z) {
		System.out.println("hecelenecek cumle : " + k);
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
				System.out.println(">>>" + dizi[c]
						+ " kelimesi doğru yazilmis");
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
			System.out
					.println(">>>" + dizi[h] + " için ayristirma sonuclari:");
			List<String[]> ayrisimlar = z.kelimeAyristir(dizi[h]);
			for (String[] strings : ayrisimlar)
				System.out.println(Arrays.toString(strings));
			h++;
		}
	}

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);
		Zemberek z = new Zemberek(new TurkiyeTurkcesi());
		String k;
		System.out.println("lutfen cumleyi giriniz:");
		k = m.nextLine();
		String dizi[] = null;
		dizi = k.split(" ");
		heceler(k, dizi, z);
		asciDonustur(k, z);
		oneriler(dizi, z);
		kelimeDenetle(dizi, z);
		kelimeCozumle(dizi, z);
		kelimeAyristir(dizi, z);
	}
}
