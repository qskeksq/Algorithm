package Algorithm;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		System.out.println(anagram("abcde", ""));
	}
	
	public static boolean anagram(String a, String b) {
		
		boolean result = true;
		
		// 먼저 길이 비교하고
		// a.toCharArray();
		// b.toCharArray();
		
		String[] aTemp = a.split("");
		String[] bTemp = b.split("");
		
		Arrays.sort(aTemp);
		Arrays.sort(bTemp);
		
		if(aTemp.length != bTemp.length) {
			return false;
		} else {
			for(int i=0; i<aTemp.length ; i++) {
				if(!aTemp[i].equals(bTemp[i])) {
					return false;
				}
			}
		}
		return result;
	}
}
