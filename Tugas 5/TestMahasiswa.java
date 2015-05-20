public class TestMahasiswa {
	public static void main(String[] args) {
		

		Mahasiswa mhs = new Mahasiswa("Yanuar Sw",25);
		mhs.tampilkanBiodata();

		System.out.println();

		mhs.setUmur(20);
		mhs.tampilkanBiodata();
	}
}