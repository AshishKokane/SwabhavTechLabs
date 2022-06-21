package com.aurionpro.model;

import com.aurionpro.test.*;

public class Reflection {

	public static void main(String[] args) {

		ReflectionTest reflectTest = new ReflectionTest();

		try {
			String name;
			name = args[0];

			reflectTest.getClassMetaData(Class.forName(name));

			// Class cname = Class.forName(name);
			// Class supercl = cname.getSuperclass(); checking if super class present or not
			// String modifiers = Modifier.toString(cname.getModifiers());
			// if (modifiers.length() > 0)
			// System.out.print(modifiers + " ");
			// System.out.print("class " + name);
			// if (supercl != null && supercl != Object.class)
			// System.out.print(" extends " + supercl.getName());

			// System.out.print("\n{\n"); calling ReflectionTest methods in this file
			// System.out.println("--Methods--");
			// System.out.println();
			// ReflectionTest.printMethods(cname);
			// System.out.println();
			// ReflectionTest.printFields(cname);
			// System.out.println("}");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.exit(0);

		;
	}

}
