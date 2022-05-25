public class armstrong(){
//check given number whether armstrong or not

	public void armstrong(int a) {
		
	int k=a,ori=a,result=0,length=0;
		for(;k!=0;k/=10,length++);
		for(;ori!=0;ori/=10){
			int remainder=ori%10;
			result += Math.pow(remainder, length);
		}
		if(a==result){System.out.println("\narmstrong "+a+"Result"+result);}
		else
		{ System.out.println("\nnot armstrong "+a+"Result"+result);}
		
		

}
}
