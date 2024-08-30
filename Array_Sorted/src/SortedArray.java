import java.util.Arrays;
import java.util.Comparator;

public class SortedArray {
//one way using java 8
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,8,7,6,4,5,1,2};
		Arrays.stream(arr).sorted().forEach(x->System.out.print(x+" "));

	}

}
