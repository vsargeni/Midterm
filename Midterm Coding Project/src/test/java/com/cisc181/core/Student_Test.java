package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	static ArrayList<Course> clist = new ArrayList();
	static ArrayList<Student> slist = new ArrayList();
	static ArrayList<Section> sclist = new ArrayList();
	static ArrayList<Enrollment> eroll = new ArrayList();
	

	@BeforeClass
	public static void setup() {
		Date d1 = new Date(2018, 9, 1);
		Date d2 = new Date(2018, 12, 31);
		Date d3 = new Date(2019, 2, 4);
		Date d4 = new Date(2019, 6, 10);

		Date DOB = new Date(1997, 7, 11);
		Student st1 = new Student("Tommy", "F", "Cruise", DOB, eMajor.COMPSI, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st2 = new Student("Alex", "F", "Cruise", DOB, eMajor.NURSING, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st3 = new Student("Anthony", "F", "Cruise", DOB, eMajor.BUSINESS, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st4 = new Student("Peter", "F", "Cruise", DOB, eMajor.COMPSI, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st5 = new Student("Tommy", "F", "Peabottom", DOB, eMajor.CHEM, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st6 = new Student("Phil", "F", "Peabottom", DOB, eMajor.CHEM, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st7 = new Student("Sean", "F", "Peabottom", DOB, eMajor.COMPSI, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st8 = new Student("Francis", "F", "Peabottom", DOB, eMajor.NURSING, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st9 = new Student("Josh", "F", "Smith", DOB, eMajor.PHYSICS, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		Student st10 = new Student("Tommy", "F", "Smith", DOB, eMajor.BUSINESS, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		slist.add(st1);
		slist.add(st2);
		slist.add(st3);
		slist.add(st4);
		slist.add(st5);
		slist.add(st6);
		slist.add(st7);
		slist.add(st8);
		slist.add(st9);
		slist.add(st10);
		Semester Spring = new Semester();
		Spring.setSectionID(UUID.randomUUID());
		Spring.setStartDate(d3);
		Spring.setEndDate(d4);
		Semester Fall = new Semester();
		Fall.setSectionID(UUID.randomUUID());
		Fall.setStartDate(d1);
		Fall.setEndDate(d2);

		Course c1 = new Course();
		Course c2 = new Course();
		Course c3 = new Course();
		c1.setCourseID(UUID.randomUUID());
		c1.setCourseName("Intro to Indoniesan Basket Weaving");
		c1.setGradePoints(4);
		c1.setMajor(eMajor.BUSINESS);
		c2.setCourseID(UUID.randomUUID());
		c2.setCourseName("How to brew beer");
		c2.setGradePoints(3);
		c2.setMajor(eMajor.CHEM);
		c3.setCourseID(UUID.randomUUID());
		c3.setCourseName("Intro to late night coding");
		c3.setGradePoints(3);
		c3.setMajor(eMajor.COMPSI);
		clist.add(c1);
		clist.add(c2);
		clist.add(c3);
		Section s1a = new Section();
		s1a.setCourseID(c1.getCourseID());
		s1a.setSemesterID(Spring.getSectionID());
		s1a.setSectionID(UUID.randomUUID());
		sclist.add(s1a);
		s1a.setRoomID(1);
		Section s2a = new Section();
		s2a.setCourseID(c2.getCourseID());
		s2a.setSemesterID(Spring.getSectionID());
		s2a.setRoomID(2);
		s2a.setSectionID(UUID.randomUUID());
		sclist.add(s2a);
		Section s3a = new Section();
		s3a.setCourseID(c3.getCourseID());
		s3a.setSemesterID(Spring.getSectionID());
		s3a.setRoomID(3);
		s3a.setSectionID(UUID.randomUUID());
		sclist.add(s3a);
		Section s1b = new Section();
		s1b.setCourseID(c1.getCourseID());
		s1b.setSemesterID(Fall.getSectionID());
		s1b.setSectionID(UUID.randomUUID());
		s1b.setRoomID(1);
		sclist.add(s1b);
		Section s2b = new Section();
		s2b.setCourseID(c2.getCourseID());
		s2b.setSemesterID(Fall.getSectionID());
		s2b.setSectionID(UUID.randomUUID());
		s2b.setRoomID(2);
		sclist.add(s2b);
		Section s3b = new Section();
		s3b.setCourseID(c3.getCourseID());
		s3b.setSemesterID(Fall.getSectionID());
		s3b.setSectionID(UUID.randomUUID());
		s3b.setRoomID(3);
		sclist.add(s3b);
		
		//created the objects, not sure how test must be run. Partial credit?
		
		

	}

	@Test
	public void testStudent() { 			
			
		

	}
	@Test
	public void testMajorchange(){
		Date DOB= new Date();
		Student st1 = new Student("Tommy", "F", "Cruise", DOB, eMajor.COMPSI, "1 WAll STREET", "(410)-767-4426",
				"Madeup@madeup.edu");
		st1.setMajor(eMajor.BUSINESS);
		assertEquals(st1.getMajor(),eMajor.BUSINESS);
	}
}