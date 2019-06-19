package com.the3linecard.project.otherClasses;

public class BinarySearch {
    int key = 30;
    int[] studentIds = {1,2,3,4,5,6,7,8};
    int last = studentIds.length -1;

 public BinarySearch(){
      // performs binary search
       int result = search(studentIds , 0, last, key);
   if(result  == -1){
System.out.println("Student is not found in the database");
    }
   else{
System.out.println("Student is found at row"+ result);
    }
 }


int search(int array[], int first,int last, int key){
     if(last >= first){
           int mid = first + (last - first)/2;
           if(array[mid] == key){
             return mid;
          }
         if( array[mid] > key){
           return search(array, first, mid-1, key);
          }
     else{
       return search(array, mid + 1, last, key);
   }
 }
  return -1;
}
    // I commented the main class bellow because it will interfere with the spring boot main class
/*
public static void main(String[]args){
    new BinarySearch ();
}
*/
}
