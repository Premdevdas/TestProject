package JavaBasics;

public class CheckPrimenumber {

	public static void main(String[] args) {
		int a=10;
		int div=0;
		int temp=0;
		
		for(int i=2;i<a;i++) {
			div=a%i;
			if(div==0) {
				temp++;
				
			}
		}
		if(temp>=1) {
			System.out.println("prime number");
		}

		else {
			System.out.println("not a prime number");
		}
	}

}
