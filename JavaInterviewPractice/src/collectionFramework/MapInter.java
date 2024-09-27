package collectionFramework;

import java.util.HashMap;

public class MapInter {
/* a map contains values on the basis of key and pair key and value pair each key and value pair is key a map contains 
 * unique keys 
 * map is useful for search ,update delete elements on the basis of key
 * points to remember:
 * java hash map contains values based on the key
 * contains only unique keys
 * hashmap have one null keyword and multiple null values
 * hashmap is non synchronized
 * maintains no order
 * 	difference between hash set and hash map
 * ans:- hashset contains only values whereas hashmap contains an entry(key and value)
 */

	public static void main(String[] args) {
		
		HashMap<Integer ,String> map = new HashMap<Integer,String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(1, "Banana"); //will override the key 
		System.out.println(map);

	}

}
