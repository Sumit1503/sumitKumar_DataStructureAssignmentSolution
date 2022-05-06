package in.datastructure.assignment.main;

import java.util.ArrayList;
import java.util.Scanner;

import in.datastructure.assignment.models.Floor;
import in.datastructure.assignment.services.DistinctFloorServices;



public class DistinctFloorMain {
	public static void main(String[] args) {
		
		int totalFloors ;
		Scanner sc =new Scanner(System.in);

		// user input for total number of floors
		System.out.println("Enter the total no of floors in the building");
		totalFloors = sc.nextInt();
		ArrayList<Floor> list = new ArrayList<Floor>(totalFloors);
		
		// getting the user input for floor size on each day
		for(int i =0; i < totalFloors; i++) 
		{
			System.out.println("Enter the floor size given on day :" +(i+1));		
			Floor f = new Floor();
			f.size = sc.nextInt();
			f.day = i+1;		
			list.add(i,f);		
		}
		DistinctFloorServices df = new DistinctFloorServices();
		df.sortFloor(list);
		sc.close();

	}


}
