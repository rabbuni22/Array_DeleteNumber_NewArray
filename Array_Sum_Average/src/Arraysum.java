import java.util.Arrays;
import java.util.OptionalDouble;

public class Arraysum {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Arraysum ar=new Arraysum();
	System.out.println("The sum of the array is: " +	ar.add());
	System.out.println("The average of the array is: " +	ar.avg());
         
       
	}
	public int add() {
		
		int arr[]= {12,23,33,43,53,63};
	 int value=Arrays.stream(arr).map(a->a).sum();
	
			return value;
		
}

	public OptionalDouble avg() {
	
		int arr[]= {12,23,33,43,53,63};
	OptionalDouble value=Arrays.stream(arr).map(a->a).average();
	
			return value;
		
		
		
	
		
	}
}
