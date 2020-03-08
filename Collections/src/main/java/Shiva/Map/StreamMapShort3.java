 package Shiva.Map;

import java.util.ArrayList;
import java.util.Collections;
 
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
 


public class StreamMapShort3 {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map=  new HashMap<>();
		//Map<String, Integer> map=new TreeMap<String, Integer>();
		
		map.put("shiva", 26);
		map.put("raju", 16);
		map.put("pawan", 46);
		map.put("kalyan", 23);
		map.put("sharat", 56);
		map.put("bhaga" ,75);
		map.put("mai", 35);
		map.put("gandham", 21);
		
		List<Entry<String, Integer>> entries= new ArrayList<>(map.entrySet());
		
		
		Collections.sort(entries, 	( o1, o2) ->o1.getValue()-o2.getValue());


			
		
		
		for(Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey()+ " " + entry.getValue());
		}
	
	}
}
