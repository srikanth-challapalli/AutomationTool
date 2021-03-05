package test;

public class SqlBuffer {
	
	public static void main(String ... strings) {
		
		/* String sqlQuery = "INSERT INTO cc_user_to_role (roleId, userId) VALUES ('1', 'schallapalli')";
	     int index = sqlQuery.indexOf("INTO");
	     String tableName = sqlQuery.substring(index+4, sqlQuery.indexOf("("));
	     System.out.println("Table Name "+tableName);*/
		
		System.out.println(System.currentTimeMillis()/600000000);
		
		String a="Hello girls Jus play hard";
		int count=a.length();
		int i=1,adprint;
		char pchar,hold;

		for(i=1;i<=count;i++)
		{
		hold=a.charAt(i);
		if(i==1)
		{
		pchar=a.charAt(0);
		System.out.print(pchar+".");
		}

		else if(hold==' ')
		{
		adprint=i+1;
		pchar=a.charAt(adprint);
		System.out.print(pchar+".");
		}
		}

		}

}
