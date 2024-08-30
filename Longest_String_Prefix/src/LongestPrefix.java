import java.util.LinkedHashMap;
import java.util.Map;

public class LongestPrefix {

	public static void main(String[] args) {
		String str="aboycando";
	
       find(str);
       
	}

	private static void find(String str) {
			 int longvalue=0;
			String longstring=null;
			Map<Character,Integer> map=new LinkedHashMap<>();
			char arr[]=str.toCharArray();
			for(int i=0;i<arr.length;i++){
			char ch=arr[i];
			if(!map.containsKey(ch)){
			map.put(ch,i);
			}else{
			i=map.get(ch);
			map.clear();
			}
			if(map.size()>longvalue) {
				longvalue=map.size();
				longstring=map.keySet().toString();
			}
			System.out.println("longest substring length is "+longvalue);
			System.out.println("longest substring is "+longstring);
			}
			}
			}
			
	


