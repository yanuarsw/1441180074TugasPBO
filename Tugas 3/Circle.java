class Circle {    
   public double radius;
   public String color;
   
   
   public Circle() {                  
      radius = 2.0;
      color = "kuning";
   }
   public Circle(double r) {           
      radius = r;
      color = "coklat";
   }
   public Circle(double r, String c) { 
      radius = r;
      color = c;
   }
   
  public double getRadius(){

   return radius;
  }
  
   public String getColor(){

   return color;
  }

   public double getArea() {
      return radius*radius*Math.PI;
   }

   public String setColor(){

      return color;
   }
}