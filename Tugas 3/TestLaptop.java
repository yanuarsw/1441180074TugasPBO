class TestLaptop{

public static void main(String[] args) {
		Laptop lpsatu = new Laptop();
		Laptop lpdua = new Laptop("Duren","Hitem");
		Laptop lptiga = new Laptop("Compaq", "Merah", "Tidak Terhubung");
		Laptop lpempat = new Laptop("Toshiba", "Hitam putih", "Terhubung", 50);
		Laptop lplima = new Laptop("Alienware","kuning","Terhubung",70,"Mati");

		lpdua.setWifi("Putus");lpdua.setBaterai(70);
		lptiga.setWifi("Putus");
		
		System.out.println("Laptop Satu: Merk = "+ lpsatu.getMerk() +" Warna = "+lpsatu.getWarna()+"	Wifi = "+lpsatu.getWifi()+" 	Baterai = "+lpsatu.getBaterai());
		System.out.println("Laptop Dua: Merk = "+ lpdua.getMerk() +"	 Warna = "+lpdua.getWarna()+"	Wifi = "+lpdua.getWifi()+" 	Baterai = "+lpdua.getBaterai());
		System.out.println("Laptop Tiga: Merk = "+ lptiga.getMerk() +"	 Warna = "+lptiga.getWarna()+"	Wifi = "+lptiga.getWifi()+" 	Baterai = "+lptiga.getBaterai());
		System.out.println("Laptop Empat: Merk = "+ lpempat.getMerk() +"	 Warna = "+lpempat.getWarna()+"	Wifi = "+lpempat.getWifi()+"	Baterai = "+lpempat.getBaterai());
		
		lplima.setWarna("Hitam Hijau");lplima.setBaterai(110);lplima.setNyala("Menyala");
		
		

		System.out.println("Laptop: Merk = "+ lplima.getMerk() +" Warna = "+lplima.getWarna()+" Wifi = "+lplima.getWifi()+" Baterai = "+lplima.getBaterai()+"Status = "+lplima.getNyala());
		System.out.println("Laptop Dua: Merk = "+ lpdua.getMerk() +"	 Warna = "+lpdua.getWarna()+"	Wifi = "+lpdua.getWifi()+" 	Baterai = "+lpdua.getBaterai());



		}
}