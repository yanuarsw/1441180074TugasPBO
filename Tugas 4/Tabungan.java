

class  Tabungan {
	

	private int simpanan;
	private String pemilik;
	private int norek;
	private double bunga;
	private double jumlah;


	public Tabungan(){

		simpanan 	=100000;
		pemilik		="Bapak Djarot";
		norek		=1441180074;
		bunga		=2;
	}

	public Tabungan(int simpananInput){

		simpanan 	=simpananInput;
		pemilik		="Bapak Djarot";
		norek		=1441180074;
		bunga		=2;
	}

	public Tabungan(int simpananInput, String pemilikInput){

		simpanan 	=simpananInput;
		pemilik		=pemilikInput;
		norek		=1441180074;
		bunga		=2;
	}

	public Tabungan(int simpananInput, String pemilikInput,int norekInput){

		simpanan 	=simpananInput;
		pemilik		=pemilikInput;
		norek		=norek;
		bunga		=2;
	}


	//menabung
	public void nabung(int nabung){

		simpanan = simpanan + nabung;
	}
	//mengambil
	public void tarik(int tarik){

		simpanan = simpanan - tarik; 
	}

	//transfer
	public void transfer(int transfer){

		transfer = simpanan - transfer; 
	}

	// menerima transfer
	int r = (int) (Math.random()*500.000);
	public void terima(){

		simpanan = simpanan + r;
		System.out.print(" Jumlah yang anda terima: "+simpanan);
	}

	//ceksaldo
	public void ceksaldo(){

		System.out.println("Saldo anda saat ini :"+simpanan);
	}


	public int getSimpanan(){

		return simpanan;
	}

	public String getPemilik(){

		return pemilik;
	}

	public int getNorek(){

		return norek;
	}



	public int setSimpanan(int simpanan){

		return this.simpanan = simpanan;
	}
	
	public String setPemililk(String pemilik){

		return this.pemilik = pemilik;
	}
	
	public int setNorek(int norek){

		return this.norek = norek;
	}



}