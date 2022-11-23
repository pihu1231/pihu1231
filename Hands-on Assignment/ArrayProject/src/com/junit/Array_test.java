package com.junit;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;


		public class Array_test{
	@Test
	public void JUnitArTest(){
        int[] arr = {32,52,89,12};
        Max_array arra = new Max_array();
        boolean poop = arra.arrayLessThan(arr);
        assertEquals(false, poop);
	}

}
