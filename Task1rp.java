package routePlanner4;
import java.util.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Task1rp {

String[] routes=null;
int count=0;
	
	
	public String[] read(String csvfile) throws IOException
	{
	
		
		FileReader fr=new FileReader(csvfile);
		BufferedReader br=new BufferedReader(fr);
	
		String line= "";
		String[] routes = null;
		try {
		while((br.readLine())!=null)
		{
			count++;
		}
		
		br.close();
		//File file1=new File(csvfile);
		
		BufferedReader br1=new BufferedReader(new FileReader(csvfile));
	
		int index=0;
		routes = new String[count];
		while((line=br1.readLine())!=null)
		{
		
			routes[index]= line;
			index++;
		}
			
		return routes;
	}
	catch(FileNotFoundException fe)
		{
		fe.printStackTrace();
		}
	return null;
	}
	//task 2......
	
	public String[] showDirectFlights(String[] routes,String fromcity)
	{
		int index=0;
		
		String part[]=null;
		String p1[] = null;
		//counting on based from city 
		for(int i=0;i<routes.length;i++)
		{
			 part=routes[i].split(",");

			 if(fromcity.equalsIgnoreCase(part[0]))
					{
						index++;
					}
		}
		//reading only those records base on from city
		p1 = new String[index];
		int i=0;
		for(String s : routes)
		{
			part= s.split(",");
			if(fromcity.equalsIgnoreCase(part[0]))
			{
				p1[i] = s;
				i++;
			}
		}
		//System.out.println("Nothing found");
		return p1;
	}
	// sorting the flights based on their destination with the help of direct flight
	
	public String[] sortDirectFlights(String[] directFlights)
	{
		String temp;
		String destination=directFlights[1];
		
		
		for(int i=0;i<directFlights.length;i++)
		{
			for(int j=i+1;j<directFlights.length;j++)
			
				if(directFlights[i].compareTo(directFlights[j])>0)
				{
					temp=directFlights[i];
					directFlights[i]=directFlights[j];
					directFlights[j]=temp;
				}
		}
		return directFlights;
	}
	
	//show all the connection between source and destination city
	
	/*
	public String[] showAllConnections(String[] routeinfo,String fromcity,String tocity)
	{

		String part[]=null;
		String p1[] = null;
		
		int i=0;
		for(String s : routeinfo)
		{
			part= s.split(",");
			if(fromcity.equalsIgnoreCase(part[0]) && tocity.equalsIgnoreCase(part[1]))
				
			{
				
				p1[i] = s;
				i++;
				return p1;
			}
			String commoncity=tocity;
			if(fromcity.equalsIgnoreCase(part[0]) && commoncity.equalsIgnoreCase(part[0]) && commoncity.equalsIgnoreCase(part[1]))
			{
				p1[i]=s;
				i++;
				break;
				
			}
			else
			{
				System.out.println("No Result Found");
			}
			
		}
		return null;
		
	}
	*/
	
}
















