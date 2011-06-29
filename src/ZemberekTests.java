import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import net.zemberek.yapi.Kelime;

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
		System.out.println(">>>Ascı ya donusmus hali:");
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
			System.out.println(">>>" + dizi[d] + " icin cozumlemeler:");
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
						.println(">>>" + dizi[c] + " kelimesi dogru yazılmıs");
			else
				System.out.println(">>>" + dizi[c]
						+ " kelimesi dogru yazılmamıs");
			c++;
		}
		System.out.println("\n");
	}

	public static void kelimeAyrıstır(String dizi[], Zemberek z) {
		int h = 0;
		while (h < dizi.length) {
			System.out.println(">>>" + dizi[h] + " icin ayristirma sonuclari:");
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

		System.out.println("lütfen cümleyi giriniz:");
		k = m.nextLine();
		String dizi[] = null;
		dizi = k.split(" ");
		heceler(k, dizi, z);
		asciDonustur(k, z);
		oneriler(dizi, z);
		kelimeDenetle(dizi, z);
		kelimeCozumle(dizi, z);
		kelimeAyrıstır(dizi, z);
	}
}
