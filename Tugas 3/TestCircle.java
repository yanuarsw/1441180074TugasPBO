class TestCircle{
public static void main(String[] args) {
		Circle djarot = new Circle();
		Circle centa = new Circle(30);
		Circle morphling = new Circle(80, "Biru kemerahan");
		Circle johnchampion = new Circle(99,"Hijau");

		

		System.out.println("Radius = "+ centa.getRadius() +" Color = "+centa.getColor()+" Luas = "+centa.getArea());
		System.out.println("Radius = "+ morphling.getRadius() +" Color = "+morphling.getColor()+" Luas = "+morphling.getArea());
		System.out.println("Radius = "+ djarot.getRadius() +" Color = "+djarot.getColor()+" Luas = "+djarot.getArea());
		System.out.println("Radius = "+ johnchampion.getRadius() +" Color = "+johnchampion.getColor()+" Luas = "+johnchampion.getArea());
		}
}