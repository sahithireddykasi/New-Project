package sahithipractice;

class Prime{
	int n;boolean flag = false;
	Prime(int n){
		this.n=n;
	}
	String calculatePrime(){
		for(int i=2;i<n;i++) { 
			if(n%i==0) 
				flag = true;
			break;
		}
		if(!flag) 
				return "prime";
		
			else
				return "not prime";
			}
		}
		
	
	


public class PrimeDemo {

	public static void main(String[] args) {
		Prime p =new Prime(4);
		String s = p.calculatePrime();
		System.out.println("the number is "+s);
		
		// TODO Auto-generated method stub

	}

}
