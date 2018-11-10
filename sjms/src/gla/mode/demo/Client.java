package gla.mode.demo;

import java.util.HashMap;
import java.util.Map;

public class Client {
	public static void main(String[] args) {
		Father father = new Father();
		HashMap map = new HashMap();
		father.show(map);
		
		Sub sub = new Sub();
		Map m = new HashMap();
		sub.show(map);
		
		Father father2 = new Father();
		father2.show2(map);
		Sub sub2 = new Sub();
		sub2.show2(map);
	}
}
