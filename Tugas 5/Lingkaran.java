class Lingkaran  {

	double r;

	public void printLing(){

		System.out.println("Jari - jari Lingkaran: "+r);
	}

	public void lingkaran(double inputJari){

		r = inputJari;
	}

	public double luasLingkaran(){

		double lsling;
		lsling = r * r *Math.PI;
		return lsling;
	}

	public double kelling(){

		double kelilingLing;
		kelilingLing = 2 *Math.PI* r;
		return kelilingLing; 
	}
	
}