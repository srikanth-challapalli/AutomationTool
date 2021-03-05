package test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.simple.parser.JSONParser;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;


public class Json {

	
	public static void main(String[] args) throws Exception
	{

	    JsonObject requestJson = new JsonObject();
	    String url = "http://localhost:8080/rt/bookings.json?currency=USD&device_type=&ip_address=74.125.228.110&locale=en&portal_id=hotelromaprague";

	    //method call for generating json

	    requestJson = generateJSON();
	    URL myurl = new URL(url);
	    HttpURLConnection con = (HttpURLConnection)myurl.openConnection();
	    con.setDoOutput(true);
	    con.setDoInput(true);

	//    con.setRequestProperty("Content-Type", "application/json; charset=utf8");
	    con.setRequestProperty("Accept", "application/json");
	    con.setRequestProperty("Method", "POST");
	    OutputStream os = con.getOutputStream();
	    os.write(requestJson.toString().getBytes("UTF-8"));
	    os.close();


	    StringBuilder sb = new StringBuilder();  
	    int HttpResult =con.getResponseCode();
	    if(HttpResult ==HttpURLConnection.HTTP_OK){
	    BufferedReader br = new BufferedReader(new   InputStreamReader(con.getInputStream(),"utf-8"));  

	        String line = null;
	        while ((line = br.readLine()) != null) {  
	        sb.append(line + "\n");  
	        }
	         br.close(); 
	         System.out.println(""+sb.toString());  

	    }else{
	        System.out.println(con.getResponseCode());
	        System.out.println(con.getResponseMessage());  
	    }  

	}
	public static JsonObject generateJSON () throws MalformedURLException

	{
		
		JSONParser parser = new JSONParser();
		try {
			   Object obj = parser.parse(new FileReader("C:\\Users\\ttuser\\Workspace\\Automation\\WebAutomation\\src\\test\\jsonRequest.json"));
			   JsonObject reqparam =  (JsonObject) obj;
			   JsonElement name = reqparam.get("locale");
	            System.out.println(name);
	            
		
	  /* String s = "http://www.abc.com";
	        s.replaceAll("/", "\\/");
	    JsonObject reqparam=new JsonObject();
	    reqparam.addProperty("type", "arl");
	    reqparam.addProperty("action", "remove");
	    reqparam.addProperty("domain", "staging");*/
	 //   reqparam.addProperty("objects", s);
	    return reqparam;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
