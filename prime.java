public class prime(){

//check whether given number is prime or not
	public void prime_number(int num){
	
		if(num==0){System.out.print("zero is neither prime nor not prime number");return;
		} boolean flag = false;
		for(int i=2;i<num/2;i++){
			if(num%i==0){
				flag=true;
				break;
			}
			
		}
		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    
		    else
		      System.out.println(num + " is not a prime number.");
		  }
}
