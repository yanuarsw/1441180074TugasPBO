class TestBangun{
	public static void main(String[] args) {


		Lingkaran ku = new Lingkaran();
		Segitiga nya = new Segitiga();

		ku.r = 7;
		nya.sisi = 10;
		nya.tinggi = 8;
		System.out.println("Propertinya: ");
		ku.printLing();
		nya.printSegitiga();

		System.out.println("");
		System.out.println("Luas Lingkaran: "+ku.luasLingkaran());
		System.out.println("Keliling Lingkaran: "+ku.kelling());
		System.out.println("");
		System.out.println("Luas Segitiga: "+nya.luasSegitiga());
		System.out.println("Keliling Segitiga: "+nya.kellSegitiga());
		System.out.println("");
		ku.lingkaran(99);
		nya.ubahSegitiga(20,30);
		System.out.println("Property baru: ");
		ku.printLing();
		nya.printSegitiga();


	}
} 