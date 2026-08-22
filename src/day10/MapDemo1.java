package day10;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
	
	public static void main(String[] args) {
		Map<String, String>dict = new HashMap<>();
		dict.put("書","book");
		dict.put("蘋果","apple");
		dict.put("電腦","computer");
		dict.put("手機","phone");
		
		
		System.out.println("書="+dict.get("書"));
		System.out.println("手機="+dict.get("手機"));
		System.out.println("蘋果="+dict.get("蘋果"));
		
		System.out.println("香蕉="+dict.get("香蕉"));
		
		dict.put("蘋果","apple fruit");
		System.out.println("蘋果更新後="+dict.get("蘋果"));
		
		System.out.println("有沒有電腦?"+dict.containsKey("電腦"));
		
		System.out.println("phone?"+dict.containsValue("phone"));
		
		System.out.println("所有的 key="+dict.keySet());
		
		System.out.println("所有的 value="+dict.values());
		
		for (Map.Entry<String, String> entry : dict.entrySet()) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key="+key+"value="+value);
		}
			
		
		
		
		
		
		
		
		
	}

}
