package string_builder;

public class MaxValueInStringArrayM2 {
	public static String purify(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != '0') {
				return s.substring(i);
			}
		}
		return s;
	}
	
	public static String max(String a,String b) {
		String s = purify(a);
		String t = purify(b);
		if(s.length()>t.length()) {
			return a;
		}
		if(t.length()>s.length()) {
			return b;
		}
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) != t.charAt(i)) {
				if(s.charAt(i)>t.charAt(i)) {
					return a;
				}
				else {
					return b;
				}
			}
		}
		if(a.length() >= b.length()) {
			return a;
		}
		else {
			return b;
		}
	}

	public static void main(String[] args) {
		String[] str = {"55","5125","002565","7521","81"};
		String maxS = str[0];
		for(int i=0;i<str.length;i++) {
			maxS = max(maxS,str[i]);
		}
		System.out.println("The max. string value is : " + maxS);
	}

}
