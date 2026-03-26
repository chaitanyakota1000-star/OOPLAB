class caluculator1{
	
	public int sum(int a , int b){
		return a+b;
	}
	
	protected int sum(int a , int b , int c){
		return a+b+c;
	}
	private double sum(double a,double b){
	
		return a+b;
	
}
    public double display(){
		return sum(0.9,0.9);
	}
}

class caluculator{
	public static void main(String args[]){
		caluculator1 c1=new caluculator1();
		int result=c1.sum(1,2);
		System.out.println(result);
		caluculator1 c2=new caluculator1();
		int result1=c2.sum(1,2,3);
		System.out.println(result1);
		caluculator1 c3=new caluculator1();
		double result2=c3.display();
		System.out.println(result2);
		
	}
}