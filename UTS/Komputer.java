class Komputer {

	protected int processor;
	protected int memori;
	protected int storage;
	
	public Komputer(){

		processor 	= 500;
		memori		= 2000;
		storage		= 500000;
	}
	
	public Komputer(int inputProcessor){

		processor 	= inputProcessor;
		memori		= 2000;
		storage		= 500000;
	}
	
	public Komputer(int inputProcessor, int inputMemori){

		processor 	= inputProcessor;
		memori		= inputMemori;
		storage		= 500000;
	}

	public Komputer(int inputProcessor, int inputMemori, int inputStorage){

		processor 	= inputProcessor;
		memori		= inputMemori;
		storage		= inputStorage;
	}
	public int getProcessor(){

		return processor;
	}
	public int getMemori(){

		return memori;
	}
	public int getStorage(){

		return storage;
	}

}
