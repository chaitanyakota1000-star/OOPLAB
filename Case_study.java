class Father{
  String landArea;
  String propertyType ;
  
  void showProperty(String landArea,String propertyType){
     System.out.println("Total area of land owned by the family: " + landArea );
	 System.out.println("Type of area land owned by the family: " + propertyType );
	 }
  
  }
  
class ChildOne extends Father{
    
	
	void showUsage(String utilization){
	System.out.println("Utilization of property by childOne: " + utilization );
	}
	
	}
	
class ChildTwo extends Father{	
	void showUsage(String utilization){
	System.out.println("Utilization of property by ChildTwo: " + utilization );
	}
	
	}
	
class Case_study{
  public static void main(String args[]){
    ChildOne obj=new ChildOne();
	obj.showUsage("paddy");
	obj.showProperty("50 Acers","Land");
    ChildTwo obj1=new ChildTwo();
	obj1.showUsage("Wheat");
	obj1.showProperty("50 Acers","Land");

	}
  }