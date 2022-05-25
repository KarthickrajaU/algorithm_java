public class character {
//find whether given character is alpha or not
	public void pro_string(char a){
		if ( (a<='z' && a>='a') || (a<='Z' && a>='A')){
			System.out.print(a+" is alphabetic");
		}else{
			System.out.print(a+" is not alphabetic");
		}
	}
	
	//count alpha and non-alpha char in given string
	public void pro_string(String b){
		 

		int char_count=0;
		char[] arr=b.toCharArray();
		int length=arr.length;
		for(int i=0;arr.length>i;i++){
			char a=arr[i];
			
		if ( (a<='z' && a>='a') || (a<='Z' && a>='A')){
			char_count+=1;
			System.out.print(a+" is alphabetic\n");
		}else{
			System.out.print(a+" is not alphabetic\n");
		}
		}
		System.out.print("\n the word:-\n"+b+" have \n"+char_count+"alpha count.\n non alphabetic "+String.valueOf(length-char_count)+" count");

	}
}
