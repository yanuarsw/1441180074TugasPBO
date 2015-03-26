public class sebelas {
	public static void main(String[] args) {
		
		
		int baris = 50;
		int kolom = 10;

		for (int i=1;i<=baris;i++) {
			if (i%2==0) 
			{
			
				System.out.print(" ");

			}
			for (int j=1;j<=kolom; j++) {
				System.out.print("#");
			}
				System.out.println(" ");
		}
	}
}
