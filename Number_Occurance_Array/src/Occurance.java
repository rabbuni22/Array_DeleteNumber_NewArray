import java.util.HashMap;
import java.util.Map.Entry;

public class Occurance {
	public static void main(String[] args) {
		int arr[]= {1,2,1,3,2,5,7,5,6,3};
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int element: arr) {
			if(map.containsKey(element)) {
				map.put(element, map.get(element)+1);
			}else {
				map.put(element, 1);
			}
		}
		for(Entry<Integer, Integer> key:map.entrySet()) {
			System.out.println("the element: "+key.getKey()+" occurs: " +key.getValue());
		}
		
	}

}
