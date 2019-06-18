package com.the3linecard.project.otherClasses;

public class CircularRotateArray {
	int[] data = {2, 3, 4, 5, 6};
	int[] temp = new int[5];
	int numberOfRotation = 3;
	
	public CircularRotateArray() {
		
		for(int i= 1; i <= numberOfRotation; i++) {
			if(i == 1) {
			temp[0] = data[4];
			temp[1] = data[0];
			temp[2] = data[1];
			temp[3] = data[2];
			temp[4] = data[3];
			}
			else if(i == 2 ) {
				temp[0] = data[3];
				temp[1] = data[4];
				temp[2] = data[0];
				temp[3] = data[1];
				temp[4] = data[2];
			}
			else {
				temp[0] = data[2];
				temp[1] = data[3];
				temp[2] = data[4];
				temp[3] = data[0];
				temp[4] = data[1];
			}
		}
		//copies the value of temporary arrary to the main data
		data = temp;
		  for(int i = 0; i < data.length; i++) {
			  System.out.println(data[i]+',');
		  }
		  
		 
	}
	
}
