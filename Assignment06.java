
public class Assignment06{
	public static void main(String[] args) {
		if(args.length!=0){
		int a=Integer.parseInt(args[0]);
		int temp=a;
		int rem=0;
		int mod=0;
		while(a!=0){
			mod=a%10;
			rem=rem*10+mod;
		    a=a/10;
		}
		if(rem==temp){
			System.out.println("the number is palindrome");
			
		}
		else{
			System.out.println("the number is not palindrome");
		}
		}
		else{
			System.out.println("The integer value is expected");
		}
		// TODO Auto-generated method stub

	}

}
