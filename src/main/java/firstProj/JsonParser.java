package firstProj;
import com.google.gson.*;

class jparser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jsonString = "{\"name\":\"John\", \"age\":31, \"city\":\"New York\"}" ;
		
		JsonParser jp = new JsonParser() ;		
		
		JsonElement je = jp.parse(jsonString);
		
		JsonObject jo  = je.getAsJsonObject() ;
		
		System.out.println(jo.get("name").getAsString());
		
		System.out.println(jo.get("age").getAsString());
		

	}

}
