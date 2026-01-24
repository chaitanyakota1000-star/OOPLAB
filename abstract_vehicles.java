abstract class transport{
	abstract void name();
}

class car extends transport{
	public void name(){
		System.out.println("travel by car");
	}
	
}

class train extends transport{
	public void name(){
		System.out.println("travel by train");
	}
}

class bike extends transport{
	public void name(){
		System.out.println("travel by bike");
	}
}	

class abstract_vehicles{
	public static void main(String args[]){
		transport t1=new car();
		transport t2=new train();
		transport t3=new bike();
		t1.name();
		t2.name();
		t3.name();
		
	}
}