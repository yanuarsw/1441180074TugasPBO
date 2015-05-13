class Notebook30 extends Komputer {
	
	private int prosessor;
	private int storage;
	private int memori;
	private int baterai;



	public Notebook30(int inputProsessor, int inputMemori,int inputStorage, int inputBaterai){

		prosessor = inputProsessor;
		memori = inputMemori;
		storage = inputStorage;
		baterai = inputBaterai;
	}

	//CetakSpesifikasi
	public void CetakSpesifikasi(){
		System.out.println("Kecepatan processor komputer: "+processor);
		System.out.println("Kecepatan processor notebook: "+prosessor);
		System.out.println("Memori: "+memori);
		System.out.println("Storage: "+storage);
		System.out.println("Baterai: "+baterai);
		System.out.println("");
	}

	public void Overclock(int prosessor){
		System.out.println("Notebook dioverclock dengan kecepatan prosessor: "+prosessor);
	}

}