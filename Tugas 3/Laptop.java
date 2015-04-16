class Laptop {
	
	private String merk;
	private String warna;
	private String wifi;
	private int baterai;
	private String nyala;

	public Laptop(){
			
		merk = "toshiba";
		warna = "biru";
		wifi = "terhubung";	
		baterai = 60;
		nyala = "Mati";
	}
	

	public Laptop(String merkInput, String warnaInput){
		merk = merkInput;
		warna = warnaInput ;
		wifi = "terhubung";
	
	}
	public Laptop(String merkInput, String warnaInput, String wifiInput){
		 merk = merkInput;
		 warna = warnaInput;
		 wifi = wifiInput;
		
	}
	public Laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput){
		 merk = merkInput;
		 warna = warnaInput ;
		 wifi = wifiInput;
		 baterai = bateraiInput ;
		 
	}

	public Laptop(String merkInput, String warnaInput, String wifiInput, int bateraiInput,String nyalaInput){
		 merk = merkInput;
		 warna = warnaInput ;
		 wifi = wifiInput;
		 baterai = bateraiInput ;
		 nyala = nyalaInput;
	}


	
	public void menyala(){

		System.out.println("Welcome to the Laptop");
	}

	public void merk(){
		System.out.println("Merk: "+merk);
	}

	public void warna(){

		System.out.println("Warna laptop: "+warna);
	}

	public void mati(){

		System.out.println("Have a nice Day");
	}


	public void indikatorBaterai(){

		System.out.println("Baterai tinggal "+baterai);
	}

	public void indikatorWifi(){

		System.out.println("Status Wifi: "+wifi);
	}

	public String getMerk(){

		return merk;
	}  

	public String getWarna(){

		return warna;
	}

	public String getWifi(){

		return wifi;
	}

	public int getBaterai(){

		return baterai;
	}

	public String getNyala(){

		return nyala;
	}

	

	public String setMerk(String merk){

		return this.merk = merk;
	}

	public String setWarna(String warna){

		return this.warna=warna;
	}
	public String setWifi(String wifi){

		return this.wifi=wifi;
	}
	public int setBaterai(int baterai){

		return this.baterai=baterai;
	}
	public String setNyala(String nyala){

		return this.nyala=nyala; 
	}

}