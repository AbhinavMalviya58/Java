import java.util.HashMap;

public class roman_to_integer
{
	public static void main(String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int n=map.get("C")+map.get("X");
        System.out.println(map+"\n"+map.size()+"\n"+n);	
	}
}
