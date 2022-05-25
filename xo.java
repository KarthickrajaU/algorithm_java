//by codewars

public class xo(){
//find x and o is same quantity in a string
	public static boolean exo(String xo) {
		
		if(!xo.contains("x")&&!xo.contains("X")&&!xo.contains("o")&&!xo.contains("O")){
			return true;
		}
		char[] a=xo.toCharArray();
		int len=a.length;
		Arrays.sort(a);
		int x_count=0,y_count=0;

		for (int i=0;i<len;i++){

			char x=a[i];
			if(x=='o' || x=='O'){
				x_count++;
			}else if(x=='x' || x=='X'){
				y_count++;
			} 
		}
		
		System.out.print(a);
		return x_count==y_count;

	}
  
}
