package com.string.zqyc;
/*
 * String��Ĳ���
 */
public class StringSearch {
	public static void main(String[] args) {
//		intLength();
//		subString();
//		startWith();
//		containString();
//		indexOfString();
		getBytesOfString();
	}
	
	public static void getBytesOfString(){
		/*
		 * getBytes() 
		 *   ���ַ���תΪ�ֽ����飬��������洢��һ���µ� byte ������
		 *  
		 */
			String str = "��";
			byte[] by = str.getBytes();
			for(int i=0;i<by.length;i++){
				System.out.println(by[i]);
			}
	}
	
	public static void indexOfString(){
		/*
		 * indexOf(int ch) 
		 *   ����ָ���ַ��ڴ��ַ����е�һ�γ��ִ���������
		 *   �����ڣ�����-1��
		 *  
		 */
			String str = "adfewew.java";
			System.out.println(str.indexOf("e"));
	}
	
	public static void containString(){
		/*
		 * contains(CharSequence s)
		 *  ���ҽ������ַ�������ָ���� char ֵ����ʱ������ true��
		 *  
		 */
			String str = "adfewew.java";
			System.out.println(str.contains("adf"));
	}
	
	public static void startWith(){
	/*
	 * startsWith(String prefix)
	 *  ���Դ��ַ����Ƿ���ָ����ǰ׺��ʼ
	 *  
	 * endsWith(String suffix) 
	 *   ���Դ��ַ����Ƿ���ָ���ĺ�׺����
	 */
		String str = "adfewew.java";
		System.out.println(str.startsWith("adf"));
		System.out.println(str.endsWith(".java"));
	}
	
	public static void subString(){
	/*
	 * String substring(int beginIndex,int endIndex)
	 * ��ȡ�ַ�����һ����,����ͷ��������β
	 * 
	 * String substring(int beginIndex)
	 * ����ͷ�������ȫҪ
	 */
		String str = "howareyou";
		String str1 = str.substring(1,5);
		String str2 = str.substring(1);
		System.out.println(str);
		System.out.println(str1);	
		System.out.println(str2);
	}
	
	public static void intLength(){
	/*
	 * int length() �����ַ����ĳ���
	 */
		String str = "sdawe@3$%Z^&*";
		int length = str.length();
		System.out.println(length);
	}
}
