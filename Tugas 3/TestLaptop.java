class TestLaptop{

public static void main(String[] args) {
		Laptop satu = new Laptop();
		Laptop dua = new Laptop("Acer","Putih");
		Laptop tiga = new Laptop("Asus", "Merah", "Tidak Terhubung");
		Laptop empat = new Laptop("Dell", "Biru", "Terhubung", 90);

		System.out.println("Laptop Pertama	: Merk = "+ satu.getMerk() +" Warna = "+satu.getWarna()+"	Wifi = "+satu.getWifi()+" 	Baterai = "+satu.getBaterai());
		System.out.println("Laptop Kedua	: Merk = "+ dua.getMerk() +"	 Warna = "+dua.getWarna()+"	Wifi = "+dua.getWifi()+" 	Baterai = "+dua.getBaterai());
		System.out.println("Laptop Ketiga	: Merk = "+ tiga.getMerk() +"	 Warna = "+tiga.getWarna()+"	Wifi = "+tiga.getWifi()+" 	Baterai = "+tiga.getBaterai());
		System.out.println("Laptop Keempat	: Merk = "+ empat.getMerk() +"	 Warna = "+empat.getWarna()+"	Wifi = "+empat.getWifi()+"	Baterai = "+empat.getBaterai());
		

		satu.setWarna("Merah mudaaa");
		satu.setBaterai(110);
		


		System.out.println("Setelah Setter");
		System.out.println("Laptop Pertama	: Merk = "+ satu.getMerk() +" Warna = "+satu.getWarna()+" Wifi = "+satu.getWifi()+" Baterai = "+satu.getBaterai());

		}
}