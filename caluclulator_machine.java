class Caluculator{
   public float add(float a , float b){
     return a+b;
	 }
   public float sub (float a,float b){
     return a-b;
	 }
   public float multi(float a , float b){
     return a*b;
	 }
   public float div(float a , float b){
     return a/b;
	 }
   }
   
 class Advance_caluculator extends Caluculator{
      public float mod(float a, float b){
	   return a%b;
	   }
	   
	  public float square(float a){
         return a*a;
	 }
 }
 
 class Area extends Advance_caluculator{
    public double circle(float r){
     return  3.14 * r*r ;
	 }
	  public float rectangle(float l , float b){
     return l*b;
	 }
}

class caluclulator_machine{
 public static void main(String args[]){
   Area obj = new Area ();
   System.out.println("Area of circle: " + obj.circle(5.0f));
   System.out.println("square of number "+obj.square(5.2f));
   System.out.println("multiplication of numbers: " + obj.multi(5.8f,2.0f));
   
   }
 }