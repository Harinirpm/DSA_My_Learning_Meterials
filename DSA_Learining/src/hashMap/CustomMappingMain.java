package hashMap;

public class CustomMappingMain {
   public static void main(String[] args) {
	   CustomMapping map = new CustomMapping();
       map.put("Degree", "Harini studying in AI&DS Dept.");
       map.put("Harini", "Harini is good Girl");
       map.put("college", "Harini studying in BIT");

       System.out.println(map.get("Harini"));
   }
}
