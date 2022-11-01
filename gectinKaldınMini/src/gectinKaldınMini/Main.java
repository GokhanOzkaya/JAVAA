package gectinKaldınMini;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Belirttiğiniz sayıda ders giriyorsunuz,girdiğinz derslerin ortalamasını(60'a 40) ve geçip geçmediğinizi size gösteriyor
		 * Constracter ve getter setter kullanılmışdır.
		 * */
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen Ders Sayısını Giriniz :  ");
		int dersSayisi = sc.nextInt();
		float genelToplam=0;
		int[] dersler = new int[dersSayisi];
		for (int i = 0; i < dersler.length; i++) {
			System.out.println("Lütfen Vizeyi Giriniz");
			float vize = sc.nextFloat();
			System.out.println("Lütfen Finali Giriniz");
			float sonFinal = sc.nextFloat();
			Hesapla hsp = new Hesapla(vize, sonFinal);
			System.out.println("Ortamanız : " + hsp.ortalama());
			genelToplam=hsp.ortalama()+genelToplam;
			if (hsp.ortalama() < 60) {
				System.out.println("Kaldın Ağla");
			} else {
				System.out.println("Helal Len Yusufi");
			}
			
		}
		if ((dersSayisi/genelToplam)<60) {
			System.out.println("Sınıfda Kaldın Kanks");
		}
		else {
			System.out.println("Geçtin");
		}

	}

}
