package accessTest2;

import accessTest.Parent;

public class OuterClass {
	public void printAccess() {
		Parent p = new Parent();
		System.out.println(p.publicValue);
		System.out.println(p.printAccess());
	}
}
