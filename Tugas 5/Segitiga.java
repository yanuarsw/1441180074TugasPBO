class Segitiga {
	
	double sisi;//Segitiga SamaSISI
	double tinggi;

	public void printSegitiga(){

		System.out.println("Sisi Segitiga: "+sisi);
		System.out.println("Tinggi Segitiga: "+tinggi);
	}

	public void ubahSegitiga(double inputSisi, double inputTinggi){

		sisi = inputSisi;
		tinggi = inputTinggi;
	}

	public double luasSegitiga(){

		double luas;
		luas = sisi * tinggi /2;
		return luas;
	}

	public double kellSegitiga(){

		double keliling;
		keliling = sisi * 3;
		return keliling;

	}
}