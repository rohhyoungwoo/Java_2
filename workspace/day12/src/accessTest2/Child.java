package accessTest2;

import accessTest.Parent;

public class Child extends Parent{
	public void printAccess() {
		System.out.println(publicValue);
		System.out.println(protectedValue);
//		System.out.println(defaultValue); // x
//		System.out.println(privateValue); // x
		
	}
}
