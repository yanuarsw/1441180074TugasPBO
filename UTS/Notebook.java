class Notebook30 extends Komputer {
	
	private int prosessor;
	private int storage;
	private int baterai;

	public Notebook(int inputProcessor){

		super(inputProcessor);
		prosessor	= 5000;
		storage		= 500000;
		baterai 	= 5000;

	}

	public Notebook(int inputProcessor, int inputProsessor){

		super(inputProcessor);
		prosessor = inputProsessor;
		storage = 500000;
		baterai = 5000;
	}

	public Notebook(int inputProcessor, int inputProsessor, int inputStorage){

		super(inputProcessor);
		prosessor = inputProcessor;
		storage = inputStorage;
		baterai = 5000;
	}

	public Notebook(int inputProcessor, int inputProsessor, int inputStorage,int inputBaterai){

		super(inputProcessor);
		prosessor = inputProcessor;
		storage = inputStorage;
		baterai = inputBaterai;
	}

	//CetakSpesifikasi
	public void CetakSpesifikasi(){
		System.out.println("Kecepatan processor komputer: "+getProcessor);
		System.out.println("Kecepatan processor notebook: "+getProsessor);
		System.out.println("Memori: "+getMemori);
		System.out.println("Storage: "+getStorage);
		System.out.println("Baterai: "+getBaterai);
	}


	public int getProsessor(){
		return prosessor;
	}

	public int getStorage(){
		return storage;
	}

	public int getMemori(){
		return memori;
	}

	public int getBaterai(){
		return baterai;
	}

	public int setProsessor(){
		return this.prosessor = prosessor;
	}

	public int setStorage(){
		return this.storage = storage;
	}

	public int setBaterai(){
		return this.baterai = baterai;
	}

	


}