import java.util.Scanner;
public class Matematika{
	
	
	public static void main(String[] args) {
		boolean run = true ;

		int angkasatu;
		int angkadua;
		int pilihan;
		int i;
		Scanner pilihmenu = new Scanner(System.in);
		
		for (i = 1 ;i < 99999 ; ) {
			
		System.out.println("======Menu======\n 1.Penjumlah\n 2.Penguarangan\n 3.Pengkalian\n 4.Pembagian\n 5.Exit");		
		pilihan = pilihmenu.nextInt();


		switch (pilihan) {

			case 1 : System.out.println("Masukan Bilangan Pertama: ");
					 angkasatu = pilihmenu.nextInt();
					 System.out.println("Masukan Bilangan Kedua: ");
					 angkadua = pilihmenu.nextInt();
					 System.out.println("Hasil Penjumlahan = "+(angkasatu+angkadua)); 
					 System.out.println(""); break;

			case 2 : System.out.println("Masukan Bilangan Pertama: ");
					 angkasatu = pilihmenu.nextInt();
					 System.out.println("Masukan Bilangan Kedua: ");
					 angkadua = pilihmenu.nextInt();
					 System.out.println("Hasil Penguarangan = "+(angkasatu - angkadua)); 
					 System.out.println(""); break;
					 
			case 3 : System.out.println("Masukan Bilangan Pertama: ");
					 angkasatu = pilihmenu.nextInt();
					 System.out.println("Masukan Bilangan Kedua: ");
					 angkadua = pilihmenu.nextInt();
					 System.out.println("Hasil Pengkalian = "+(angkasatu * angkadua)); 
					 System.out.println(""); break;
					 
			case 4 : System.out.println("Masukan Bilangan Pertama: ");
					 angkasatu = pilihmenu.nextInt();
					 System.out.println("Masukan Bilangan Kedua: ");
					 angkadua = pilihmenu.nextInt();
					 System.out.println("Hasil Pembagian = "+(angkasatu % angkadua)); 
					 System.out.println(""); break;

			case 5 :  System.exit(0); break;

		}	
		}
	}
}