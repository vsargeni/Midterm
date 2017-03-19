package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}

	@Test
	public void testStaffSalary() {
		ArrayList<Staff> employed = new ArrayList();
		Date d1 = new Date(1979, 9, 13);
		Date hire = new Date(2000, 1, 1);
		Staff s1 = new Staff("John", "B", "Doe", d1, "42 Walaby Way", "(302)-323-4432", "madeup@madeup.org",
				"MWF 2-3pm", 3, 200000, hire, eTitle.DR);
		Staff s2 = new Staff("Joel", "B", "Doe", d1, "44 Walaby Way", "(302)-443-4432", "madeup@madeup.org",
				"MWF 2-3pm", 3, 120000, hire, eTitle.MR);
		Staff s3 = new Staff("Jane", "L", "Doe", d1, "87 Walaby Way", "(885)-323-4432", "madeup@madeup.org",
				"MWF 2-3pm", 3, 150000, hire, eTitle.MRS);
		Staff s4 = new Staff("Shery", "B", "Moe", d1, "200 Walaby Way", "(410)-323-4432", "madeup@madeup.org",
				"MWF 2-3pm", 3, 130000, hire, eTitle.DR);
		Staff s5 = new Staff("Kenny", "Danger Zone", "Loggins", d1, "HIGHWAY TO THE DANGERZONE", "(302)-378-4432", "madeup@madeup.org",
				"MWF 2-3pm", 3, 100000, hire, eTitle.Prof);
		employed.add(s1);
		employed.add(s2);
		employed.add(s3);
		employed.add(s4);
		employed.add(s5);
		double total=0;
		for (int i =0;i<employed.size();i++){
			total+=(employed.get(i).getSalary()/5);
		}
		//check average of the salaries
		assertEquals(140000,total,0.1);
	}
	
	// bad phone number
	@Test (expected = PersonException.class)
	public void testStaffNumber() throws PersonException{
		Date d1 = new Date(1979, 9, 13);
		Date hire = new Date(2000, 1, 1);
		Staff s1 = new Staff("John", "B", "Doe", d1, "42 Walaby Way", "(302)-3-4432", "madeup@madeup.org",
				"MWF 2-3pm", 3, 200000, hire, eTitle.DR);
		
		Person.isPersonCreatedRight(s1);
			
		}
	
	// bad DOB
		@Test (expected = PersonException.class)
		public void testStaffDOB() throws PersonException{
			Date d1 = new Date(3010, 9, 13);
			Date hire = new Date(2000, 1, 1);
			Staff s1 = new Staff("John", "B", "Doe", d1, "42 Walaby Way", "(302)-333-4432", "madeup@madeup.org",
					"MWF 2-3pm", 3, 200000, hire, eTitle.DR);
			
			Person.isPersonCreatedRight(s1);
				
			}
		
	
	

}
