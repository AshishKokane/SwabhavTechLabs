package com.aurionpro.model;

import com.aurionpro.test.*;

public class Reflection {

	public static void main(String[] args) {

		ReflectionTest reflectTest = new ReflectionTest();

		try {
			String name;
			name = args[0];

			reflectTest.getClassMetaData(Class.forName(name));

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);

		;
	}

}
