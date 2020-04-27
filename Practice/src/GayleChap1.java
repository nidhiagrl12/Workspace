import java.util.Hashtable;
import java.lang.Exception;

public class GayleChap1 {

	// Reverse a string function
	public static String ReverseStr(String str) {
		
		if (str == null) return null;

		int i = 0, j = str.length() - 1;
		char temp;
		char[] array = str.toCharArray();
		while (i < j) {
			temp = array[i];
			array[i++] = array[j];
			array[j--] = temp;
		}
		return String.copyValueOf(array);

	}

	// Check if two strings are permutation of each other
	public static boolean SameStrCombo(String str1, String str2) throws Exception {
		if(str1 == null || str2 == null)  throw new Exception("One or both of the strings are null");
		if(str1.length() != str2.length()) return false;
		
		Hashtable<Character, Integer> Hash = new Hashtable<Character, Integer>();

		for(char c: str1.toCharArray()) 
			if(Hash.containsKey(c))
				Hash.put(c, Hash.get(c)+1);
			else
				Hash.put(c,1);
		
		for(char c: str2.toCharArray()) 
			if(Hash.containsKey(c))
				Hash.put(c,Hash.get(c)-1);
			else
				return false;
		
		for( int k: Hash.values())
			if(k != 0) return false;
		return true;				
				
	}
	
	//Q1 Check if string has all unique characters
	public static boolean UniqueStr(String str1) throws Exception {
		if (str1 == null) throw new Exception("string is null");
		Hashtable<Character,Integer> Hash = new Hashtable<Character, Integer>();
		
		for(char c: str1.toCharArray()) 
			if(Hash.containsKey(c)) return false;
			else Hash.put(c,1);
		 return true;
	}

	public static void main(String[] args) throws Exception {
		String str1 = "bae", str2 = "bab";
		// str=ReverseStr(str);
		// System.out.println(str);

		/*if (SameStrCombo(str1, str2))
			System.out.println("Pemutation");
		else
			System.out.println("Not a Pemutation");*/
	/*	if(UniqueStr(str1)) System.out.println("Unique");
		else System.out.println("Not Unique");*/
		ReplaceSpace(str1);
	}
}
