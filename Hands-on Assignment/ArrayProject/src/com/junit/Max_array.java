package com.junit;



public class Max_array {
	public static void main(String[] args){
        Max_array array = new Max_array();
        int arr[] = {23,25,50,68,3};
        System.out.println(array.arrayLessThan(arr));
    }

    public boolean arrayLessThan(int array[]){
        for (int element : array) {

            if(element>20){
                return true;
            }
            else{
                return false;
            }
  

	}
		return false;

    }    
}