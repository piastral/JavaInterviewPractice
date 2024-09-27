package collectionFramework;
import java.util.*;
public class MapPracticeInterview1 {

	public static void main(String[] args) {
		HashMap<String,Integer> courses = new HashMap<>();
		courses.put("core java ", 4000);
		courses.put("core python ", 5000);
		courses.put("core spring framework ", 6000);
		courses.put("qa ", 7000);
		courses.put("qa ", 8000);
		//duplicate keys are not allowed
		//keys ordered not maintain
		
		
	courses.forEach((e1,e2)->{
		System.out.println(e1+"->"+e2);
	});// we will get bi consumer
		

	}

}
