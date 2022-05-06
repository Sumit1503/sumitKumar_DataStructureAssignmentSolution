package in.datastructure.assignment.services;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import in.datastructure.assignment.models.Floor;


public class DistinctFloorServices {
	
		// method to display on which day which floor will be installed
		public void sortFloor(ArrayList<Floor> list)
		{
			
			Queue<Floor> que = new LinkedList<Floor>();
			
			//addElement to queue adds Floor to queue in descending order
			addElementToQueue(que, list);
			
			//logic for the installation of floor by size
			int position =0;
			while(!que.isEmpty()) 
			{
				Floor f = que.poll();
				
				int floorDay = f.day;
				if(floorDay < position) 
				{
					System.out.print(f.size +",");				
				}
				else if(floorDay > position)
				{
					int j;
					for( j = position; j< floorDay; j++)
					{
						System.out.println();
						System.out.println("day "+ (j+1) +":");
					}
					System.out.print(f.size + ",");
					position = j;
				}	
			}
						
		}


		// add Floors to queue in descending order
		public void addElementToQueue(Queue<Floor> que, ArrayList<Floor> list)
		{
			ArrayList<Floor> tempList = new ArrayList<Floor>(list.size());
			tempList.addAll(list);
			while(!tempList.isEmpty())
			{
				int max =0;
				Floor maxFloor = new Floor();
				int index = 0;
				for(int i=0; i < tempList.size();i++)
				{
					Floor var = tempList.get(i);
					if(var.size > max)
					{
						index = i;
						max = var.size;
						maxFloor.day =var.day;
						maxFloor.size=var.size;
	
					}				
				}
				que.add(maxFloor);
				tempList.remove(index);
			}	
		}


}
