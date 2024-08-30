import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate_words {

	public static void main(String[] args) {
		String str="Everybody set they goal when they are study";
		String str1[]=str.split(" ");
		Set<String> set=new HashSet<String>();
	List<String> DuplicateStrings=	Arrays.stream(str1).filter(word->!set.add(word)).collect(Collectors.toList());
System.out.println(DuplicateStrings);
	}

}
