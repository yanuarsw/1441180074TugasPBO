class mobil {
	
	private int kcptan;
	private String posisi; 
	private String noplat;
	private String merk;
	private String warna;
	private String mesin;
	public int maxspeed = 350;


	public mobil(){
		
 		kcptan = 350;
	 	posisi = "Diangkasa"; 
	 	noplat = "AG 5454 ji" ;
	 	merk = "Peugeot";
	 	warna = "Hitam";
	 	mesin = "Twin-Turbo Charger" ;
	}
	public mobil(int kcptanInput, String posisiInput){
		
 		kcptan = kcptanInput;
	 	posisi = posisiInput; 
	 	noplat = "AG 5454 ji" ;
	 	merk = "Peugeot";
	 	warna = "Hitam";
	 	mesin = "Twin-Turbo Charger" ;
	}
public mobil(int kcptanInput, String posisiInput, String noplatInput){
		
 		kcptan = kcptanInput;
	 	posisi = posisiInput; 
	 	noplat = noplatInput ;
	 	merk = "Peugeot";
	 	warna = "Hitam";
	 	mesin = "Twin-Turbo Charger" ;
	}
public mobil(int kcptanInput, String posisiInput, String noplatInput, String merkInput){
		
 		kcptan = kcptanInput;
	 	posisi = posisiInput; 
	 	noplat = noplatInput ;
	 	merk = merkInput;
	 	warna = "Hitam";
	 	mesin = "Twin-Turbo Charger" ;
	}
public mobil(int kcptanInput, String posisiInput, String noplatInput, String merkInput, String warnaInput){
		
 		kcptan = kcptanInput;
	 	posisi = posisiInput; 
	 	noplat = noplatInput ;
	 	merk = merkInput;
	 	warna = warnaInput;
	 	mesin = "Twin-Turbo Charger" ;
	}

	public mobil(int kcptanInput, String posisiInput, String noplatInput, String merkInput, String warnaInput, String mesinInput){
		
 		kcptan = kcptanInput;
	 	posisi = posisiInput; 
	 	noplat = noplatInput ;
	 	merk = merkInput;
	 	warna = warnaInput;
	 	mesin = mesinInput ;
	}

	//maju
	public void maju(){

		kcptan++;
	}
	//mundur
	

	//berhenti
	public void berhenti(){

		kcptan = 0;
	}

	//belok

	//ngebut
	public void ngebut(){

		kcptan = maxspeed;// ada attributnya <<<(maxspeed), belum dikasi nunggu...
	}

	//ngerem
	public void ngerem(){

		kcptan--;
	}

	public int getKcptan(){

		return kcptan;
	}

	public String getPosisi(){

		return posisi;
	}

	public String getNoplat(){

		return noplat;
	}

	public String getMerk(){

		return merk;
	}

	public String getWarna(){

		return warna;
	}

	public String getMesin(){

		return mesin;
	}



	public int setKcptan(int kcptan){

		return this.kcptan = kcptan;
	}


	public String setPosisi(String posisi){

		return this.posisi = posisi;}

	public String setNoplat(String noplat){

		return this.noplat = noplat;}

	public String setMerk(String merk){

		return this.merk = merk;}

	public String setWarna(String warna){

		return this.warna = warna;}

	public String setMesin(String mesin){

		return this.mesin = mesin;}







}