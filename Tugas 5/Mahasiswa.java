class Mahasiswa {

	private String nama;
	private int umur;

	Mahasiswa(){

		nama= "Yanuar Satria Wijaya";
		umur= 20;
	}

	Mahasiswa(String inputNama){
		nama=inputNama;
		umur= 20;
	}	

	Mahasiswa(String inputNama,int inputUmur){
		nama=inputNama;
		umur=inputUmur;
	}	

	public void tampilkanBiodata(){

		System.out.println("::: BIODATA :::");
		System.out.println("Nama: "+getNama());
		System.out.println("Umur: "+getUmur());
	}

	public String setNama(String n){

		return nama=n;
	}

	public int setUmur(int u){
		return umur=u;
	}

	public String getNama(){
		return  this.nama = nama;
	}

	public int getUmur(){
		return  this.umur = umur;
	}




	
}