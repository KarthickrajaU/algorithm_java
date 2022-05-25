//Square each integer and place them orderly in sameline
//by codewars 
public class square_int(){
public static int square_each_int_con(int n) {
		
		 int total=0,tmp=n,length=0,sep,l1;
		 int add=1,res=0;
		    
		    for (;tmp!=0;tmp/=10,length++);
		    tmp=n;
		    for(;tmp!=0;tmp/=10,length--)
		    {
		      sep=tmp%10;
		      total=sep*sep;  
		      l1=total;
		      if(l1==0&&length!=0){
			    	add*=10;  
			      }
		      total*=add;
		      
		      for(;l1!=0;l1/=10,add*=10);
		     
		     res+=total;
		    }
		    System.out.print(res);
			return res;

			

	}}
