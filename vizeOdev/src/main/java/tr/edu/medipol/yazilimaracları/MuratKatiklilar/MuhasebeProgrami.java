package tr.edu.medipol.yazilimaraclarý.MuratKatiklilar;
import java.util.Scanner;

public class MuhasebeProgrami {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
        System.out.println("Calisilan Saati Giriniz ");
        int calisilansaat = scan.nextInt();
        System.out.println("Saatlik ucreti giriniz ");
        int saatlikucret = scan.nextInt();
        System.out.println("Hesaplanan Ucret : " + (calisilansaat * saatlikucret));
    }
	
	
	
	public static int UcretHesapla(int calisilansaat, int saatlikucret) {
		int UcretHesapla = calisilansaat * saatlikucret;
		return UcretHesapla;
	}

}
