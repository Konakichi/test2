package src;

import java.util.concurrent.ConcurrentHashMap;

public class Kenzan {

	public ConcurrentHashMap<String, String> Map2 = new ConcurrentHashMap<String, String>();
	
	private ConcurrentHashMap<String, String> Map1 = null;
	
	/***
	 * コンストラクタ
	 * Yoshikiからクラス生成で呼ばれる
	 */
	public Kenzan(String className) {

		try {

			// クラスのロード
			Class<?> clazz = Class.forName(className);

			// インスタンスの生成
			Object obj = clazz.newInstance();

			// 型が確定している場合はキャスト
			Param myObject = (Param) obj;

			// インスタンスの利用
			Map1 = myObject.Init();
			
			
//			System.out.print(Map1.get("a"));

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}
	
	public String cmz00001() {
	
		String id = "cmz00001";
		
		if (Map2.containsKey(id)) {
			return Map2.get(id);
		}
		
		
		String aaa = Map1.get("a");
		Map2.put(id, aaa);
		
		String cmz00002 = cmz00002();
		String cmz00003 = cmz00003();
		
		return Map2.get(id);
		
		
	}
	
	public String cmz00002() {
	
		String id = "cmz00002";
		
		if (Map2.containsKey(id)) {
			return Map2.get(id);
		}
		Map2.put(id, "bbbb");
		
		return Map2.get(id);
	}
	
	public String cmz00003() {
	
		String id = "cmz00003";
		
		if (Map2.containsKey(id)) {
			return Map2.get(id);
		}
		Map2.put(id, "cccc");
		
		return Map2.get(id);
		
		
	}
	
}
