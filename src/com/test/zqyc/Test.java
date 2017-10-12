package com.test.zqyc;

public class Test {
	public static void main(String[] args) {
//		String str = " www.WOAi.com ";
//		showString(str);
//		System.out.println(getPropertyGetMethodName("age"));
//		System.out.println(isDc("ab12321ba"));
		String str1 = "ab";
		String str2 = "abc";
		String str3 = str1+"c";
		
		System.out.println(str2 == str3);
	}
	
	public static void showString(String str){
		System.out.println(str.isEmpty());
		if(str.isEmpty() == false){
			System.out.println(str.charAt(0));
			System.out.println(str.toLowerCase());
			System.out.println(str.toUpperCase());
			System.out.println(str.replace('w', 'g'));
			System.out.println(str.replace("com", "net"));
			System.out.println(str.trim());//去掉两端的空格
		}
	}
	
	public static String getPropertyGetMethodName(String property){
		String first = property.substring(0, 1);
		String last = property.substring(1);
		String getName = "get"+first.toUpperCase()+last+"();";
		return getName;
	}
	
	public static boolean isDc(String str){
		boolean flag = true;
		if(str.length() == 1)
			return true;
		for(int i=0;i<str.length()-i-2;i++){
			if(str.charAt(i) != str.charAt(str.length()-i-1))
				return false;
		}
		return flag;
	}
}
