package com.regex.zqyc;
/*
 * 验证邮箱是否合法
 * 规则:
 * 1234567@qq.com
 * mymail@sina.com
 * nihao@163.com
 * wdmail@yahoo.com.cn
 * @前面：可以是数字，字母，_	  不少于1个
 * @后面 .前面：数字，字母，不少于1个
 * .后面：字母  
 * 
 */
public class RegexEmail {
	public static void main(String[] args) {
		String email = "a33bc@abcsww223.com";
		System.out.println(checkEmail(email));
	}
	public static boolean checkEmail(String emailStr){
		boolean rs ;
		rs = emailStr.matches("[a-zA-Z_0-9_]+@[a-zA-Z_0-9]+(\\.[a-z]+)+");
		return rs;
	}
}
