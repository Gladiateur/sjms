package gla.mode.demo;

import java.util.HashMap;
import java.util.Map;

public class Sub extends Father{
	public void show(Map map) {
		System.out.println("sub...");
	}
	
	public void show2(HashMap map) {
		System.out.println("sub2...");
	}
}
