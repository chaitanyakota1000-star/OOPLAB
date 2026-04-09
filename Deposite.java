class Bank{
   public void deposit(){
       System.out.println("----deposition-----");
       }
   }
 class Cash_deposit extends Bank{
     public void deposit(int a){
	   System.out.println("cash  deposite is: "+ a);
	   }
	 }
	 
class cheque_deposite extends  Cash_deposit{
     public void deposit(String amount, int a){
	   System.out.println("cheque" + amount + a +"is deposited");
	   }
	 }
class online_transfer extends cheque_deposite {
   public void deposit(String platform, double a){
     System.out.println("online deposition" + a + "on platform"+ platform);
	 }
   } 
 class Deposite{
   public static void main(String args[]){
        online_transfer B=new online_transfer();
		B.deposit();
		B.deposit(500);
		B.deposit("fifteen thousand",15000);
		B.deposit("phone pay",15000.0);
		}
 }