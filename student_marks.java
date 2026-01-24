class students{
	final String Name="chaitanya";
	int maths;
	int science;
   
		public final void  marks(){
			  maths=90;
	          science=90;
		}
		public void data(){
		maths=80;
		science=80;
		
		}
	
}
class student_marks{
	public static void main(String args[]){
		students s1=new students();
		s1.marks();
		s1.data();
		System.out.println(s1.Name);
		System.out.println(s1.maths);
		System.out.println(s1.science);
	}
}