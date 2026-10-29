package Practical4;

import java.util.HashMap;

public class MapOperations {

	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~ Umang 153 ~~~~~~~~~~");
		java.util.Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "ABC");
		map.put(2, "PQR");
		map.put(3, "UVW");
		map.put(4, "XYZ");
		System.out.println("Initial Map");
		map.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));
		if(map.containsKey(2)) {
			map.remove(2);
		}
		System.out.println("\nMap After Removing key 2 : ");
		map.forEach((k,v) -> System.out.println("Key : "+k+",Value: "+v));
		int searchKey = 1;
		if(map.containsKey(searchKey)){
			System.out.println("\nkey"+searchKey+" found in the map.");
			
		}else {
			System.out.println("\nKey"+searchKey+"not foud in  the map.");
			
		}
		String value = map.get(1);
		System.out.println("\nVlaue at key 1 :"+value);
		java.util.Map<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(4, "LMN");
		map2.put(5, "OPQ");
		map.putAll(map2);
		System.out.println("\nMap after adding another Map : ");
		map.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));
		System.out.println("\nFinal Map : ");
		map.forEach((k,v)->System.out.println("Key: "+k+", Value: "+v));
	}
}
