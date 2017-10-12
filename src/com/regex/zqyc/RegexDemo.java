package com.regex.zqyc;

/*
 * 正则表达式相关的三个方法
 * 		boolean mathes(String 正则规则)
 * 		"abc".mathes("[a]")	匹配成功返回true
 * 
 * 		String[] split(String 正则规则)
 * 		"abc".split("a")  使用正则规则对字符串进行切割
 * 
 * 		String replaceAll(String 正则规则,String 字符串)
 * 		"abc0123".replaceAll("[\\d]","#")
 * 		用#替换数字
 */
public class RegexDemo {
	public static void main(String[] args) {
//		String strQQ = "643702886";
//		if(checkQQ(strQQ)){
//			System.out.println(strQQ+"是一个QQ号码");
//		}else{
//			System.out.println(strQQ+"不是一个QQ号码");
//		}
		
		String strPhone = "18437028861";
		if(checkTel(strPhone)){
			System.out.println(strPhone+" 是一个手机号");
		}else{
			System.out.println(strPhone+" 不是一个手机号");
		}
		
	}
	
	public static boolean checkQQ(String strQQ){
	/*
	 * 检查QQ号是否合法
	 * 0不能开头，全是数字，5-10位
	 * 123456
	 * \\d 把\转为普通的斜线  表示匹配1-9数字
	 * \\D 匹配不是数字的
	 */
		boolean rs = strQQ.matches("[1-9][\\d]{4,9}");
		return rs;
	}
	
	public static boolean checkTel(String strPhone){
	/*
	 * 检查手机号是否合法
	 * 1开头，第二位可以是34578，0-9，位数固定为11位
	 */
			boolean rs = strPhone.matches("1[34578][\\d]{9}");
			return rs;
		}
}
