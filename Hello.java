class A{
    
    public int addition(int a,int b){
	    return a+b;
		}
	public int sub(int a,int b){
	    return a-b;
	}
	public int multi(int a,int b){
	    return a*b;
	}
	public int division(int a,int b){
	    return a/b;
		}
}

class Hello{
    public static void main(String args[]){
	        A obj = new A();
			int result_add=obj.addition(5,3);
			int result_sub=obj.sub(5,3);
			int result_multi=obj.multi(5,3);
			int result_div=obj.division(6,3);
			
			System.out.println("addition : "+result_add);
			System.out.println("subtraction : " + result_sub);
			System.out.println("multiplication : " + result_multi);
			System.out.println("division : " + result_div);
			
			if (result_add > result_sub && result_sub<result_multi){
				System.out.println("result_add is greater than result_sub and result_sub is less than result_multi ");
			}
			else {
				System.out.println("result_add is less than result_multi or result_sub is greater than result_multi");
			}
			
			if (result_multi>=result_div || result_multi<result_add){
				System.out.println("either result_multi is greater than result_div or result_multi is less than result_add ");
			}
			else{
				System.out.println("both result_div is greater than result_multi and result_add is less than result_multi is true");
			}
			
			if (result_add==result_multi){
				System.out.println("its true that result_add and result_multi is same ");
			}
			else{
				System.out.println("result_add and result_multi is both are same is false  ");
			}
			
				
			
			}
	}