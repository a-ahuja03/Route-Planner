package routePlanner4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;



public class App {
	public static void main(String[] args) throws IOException,FileNotFoundException
	{
		
		Task1rp t1=new Task1rp();
		Scanner sc=new Scanner(System.in);
		String pathn="A:\\assignment\\routePlanner4\\";
		System.out.print("Enter file name...");
		String filename=sc.nextLine();
		String[] r =t1.read(pathn+filename);
		
			System.out.format("from \t\t To \t Distance in Km\t   travel time \t   Typical Airfare\n");
			System.out.println("--------------------------------------------------------------------------------");
			//String[] r=t1.read("A:\\assignment\\routePlanner4\\routes.csv");
			for(String s : r)
			{
				String p[] = s.split(",");
				System.out.format("%-15s %-15s %-15s %-15s %-15s\n",p[0],p[1],p[2],p[3],p[4]);
			}
			
			System.out.println("\n\n=============================== Direct Flight =======================\n\n");
			System.out.print("Enter a FLight Name...");
			String str=sc.next();
		  
			String direct[] = t1.showDirectFlights(r, str);
			for(String s : direct)
			{
				String p[] = s.split(",");
				System.out.format("%-15s %-15s %-15s %-15s %-15s\n",p[0],p[1],p[2],p[3],p[4]);
			}
		  
			System.out.println("\n\nWant Sorted List of All direct Flight y/n");
			char check=sc.next().charAt(0);
			if(check=='y')
			{
			System.out.println("\n\n================================ Sorted Flights =====================\n\n");
			String[] sorted=t1.sortDirectFlights(direct);
			for(String s : sorted)
			{
				String p[]=s.split(",");
				System.out.format("%-15s %-15s %-15s %-15s %-15s\n",p[0],p[1],p[2],p[3],p[4]);
				
			}
			}
			
			/*
			System.out.println("\n\n================================ Connection between Flights =====================\n\n");	
			String[] connect=t1.showAllConnections(r, "Delhi", "London");
					for(String s:connect)
					{
						String p[]=s.split(",");
						System.out.format("%-15s %-15s %-15s %-15s %-15s\n",p[0],p[1],p[2],p[3],p[4]);
						
					}
			*/		
			
	}

}
