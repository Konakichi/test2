package src;

import java.util.concurrent.ConcurrentHashMap;

public class Param {

//	public ConcurrentHashMap<String, String> Map = new ConcurrentHashMap<String, String>();
	
	public void Param() {
		
		
		
	}
	
	/**
	 * ここでパラメータすべて設定
	 */
	public ConcurrentHashMap<String, String> Init() {
		
		
		var result = new ConcurrentHashMap<String, String>();
		
		System.out.println("a");
		
		result.put("a", "b");
		
		
		return result;
		
	}
	
}
