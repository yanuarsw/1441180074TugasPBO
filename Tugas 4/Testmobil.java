class Testmobil {

	public static void main(String[] args) {
		
		mobil mblku = new mobil();
		mobil mblnya = new mobil(200,"Di garasi");

		mblnya.setNoplat("B 0 Nek");

		System.out.println("Mobil ku:\nKecepatan\t: "+mblku.getKcptan()+"Km/hour"+"\nPosisi\t\t: "+mblku.getPosisi()+"\nNomor Plat\t: "+mblku.getNoplat()+"\nMerk\t\t: "+mblku.getMerk()+"\nWarna\t\t: "+mblku.getWarna()+"\nMesin\t\t: "+mblku.getMesin());

		System.out.println("Mobil nya:\nKecepatan\t: "+mblnya.getKcptan()+"Km/hour"+"\nPosisi\t\t: "+mblnya.getPosisi()+"\nNomor Plat\t: "+mblnya.getNoplat()+"\nMerk\t\t: "+mblnya.getMerk()+"\nWarna\t\t: "+mblnya.getWarna()+"\nMesin\t\t: "+mblnya.getMesin());

		System.out.println("Setelah diModifikasi: ");

		mblku.setKcptan(1000);mblku.setMesin("Twin-Turbo Charger + Nos>");mblku.setWarna("Silver Metalic");
	
		System.out.println("Mobil ku:\nKecepatan\t: "+mblku.getKcptan()+"Km/hour"+"\nPosisi\t\t: "+mblku.getPosisi()+"\nNomor Plat\t: "+mblku.getNoplat()+"\nMerk\t\t: "+mblku.getMerk()+"\nWarna\t\t: "+mblku.getWarna()+"\nMesin\t\t: "+mblku.getMesin());


	}
	
}