class student{
	static String name="chaitanya";
	static int maths;
    public static void marks(){
	  
	  System.out.println(name);
}
}
class static_exp{
	public static void main(String args[]){
		student.maths=90;
		student.marks();
		
		System.out.println(student.name +":"+student.maths);
	}
}