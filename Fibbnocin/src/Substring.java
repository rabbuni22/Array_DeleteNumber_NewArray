
public class Substring {

	public static void main(String[] args) {
	
	int n=10;
	int start=0;
	int second=1;
	int result = 0;
	System.out.print(start+" ");
	for(int i=1;i<=10;i++) {
		
	
	 start=second;
	 second=result;
	 result=start+second;
	 System.out.print(result+" ");
	 
	}
	
	}

}
