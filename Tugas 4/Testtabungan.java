import java.util.Scanner;

class TestTabungan {
	
	public static void main(String[] args) {
		int simpanan;

		Tabungan ku = new Tabungan(100000);


		Scanner in = new Scanner(System.in);

		ku.setSimpanan(500000);
		
		System.out.print("Selamat datang di Bang DjaRotVanDeFart");
		System.out.println("Data anda:\n Nama: "+ku.getPemilik()+"\tNorek: "+ku.getNorek());
		System.out.println("Silakan pilih salah satu,\n dari berberapa pilihan yang tersedia:");
		System.out.println("1.Tabung");
		System.out.println("2.Penarikan tunai");
		System.out.println("3.Transfer dana");
		System.out.println("4.Dana yang anda terima");
		System.out.println("5.Check saldo");
		

		System.out.print("1 - 5: ");
		int p = in.nextInt();

		switch (p) {

			case 1 :
			System.out.println(" Silakan masukan jumlah yang akan anda masukan: ");
			int nabung = in.nextInt();
			ku.nabung(nabung);
			ku.ceksaldo();
			break;
			case 2 :
			System.out.println("Silakan masukan jumlah yang akan anda tarik: ");
			int tarik = in.nextInt();
			ku.tarik(tarik);
			ku.ceksaldo();
			break;

			case 3 :
			System.out.println("Silakan masukan jumlah yang akan anda transfer: ");
			int transfer = in.nextInt();
			ku.transfer(transfer);
			ku.ceksaldo();
			break;

			case 4 : 
			ku.terima();
			break;

			case 5 :
			ku.ceksaldo();
			break;




			default:

			System.out.print(" Silakan masukan angka 1 - 5");

			
		}



	}
}