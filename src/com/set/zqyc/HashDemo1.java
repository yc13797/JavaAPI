package com.set.zqyc;

import java.util.HashSet;

public class HashDemo1 {
	public static void main(String[] args) {
		HashSet<Person> per = new HashSet<Person>();
		per.add(new Person("a",18));
		per.add(new Person("a",18));
		per.add(new Person("b",17));
		per.add(new Person("b",18));
		per.add(new Person("Ğ¡Àî",18));
		
		System.out.println(per);
	}
}
