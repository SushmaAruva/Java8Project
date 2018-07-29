package CopyObjects;

public class CopyObj implements Cloneable {

	static int a = 6;
	int b = 2;
	static int c = a;
	// c=4;

	public static void main(String[] args) throws CloneNotSupportedException {
		try {
			c = 4;
			System.out.println("ccccccccc " + c);
			System.out.println("aaaaaaaa " + a);
			CopyObj orig = new CopyObj();

			CopyObj dup = orig;
			System.out.println("******** Copy **********");
			System.out.println("Original values - a :  " + orig.a + " b : " + orig.b);
			System.out.println("Duplicate values - a :  " + dup.a + " b : " + dup.b);
			orig.a = 7;
			System.out.println("After Org val change Original values - a :  " + orig.a + " b : " + orig.b);
			System.out.println("After Org val change Duplicate values - a :  " + dup.a + " b : " + dup.b);
			dup.b = 3;
			System.out.println("After Dup val change Original values - a :  " + orig.a + " b : " + orig.b);
			System.out.println("After Dup val change Duplicate values - a :  " + dup.a + " b : " + dup.b);

			CopyObj dup2 = (CopyObj) orig.clone();
			System.out.println("******** Clonee **********");
			System.out.println("Original values - a :  " + orig.a + " b : " + orig.b);
			System.out.println("Duplicate values - a :  " + dup2.a + " b : " + dup2.b);
			orig.a = 8;
			System.out.println("After Org val change Original values - a :  " + orig.a + " b : " + orig.b);
			System.out.println("After Org val change Duplicate values - a :  " + dup2.a + " b : " + dup2.b);
			dup2.b = 4;
			System.out.println("After Dup val change Original values - a :  " + orig.a + " b : " + orig.b);
			System.out.println("After Dup val change Duplicate values - a :  " + dup2.a + " b : " + dup2.b);
		} catch (CloneNotSupportedException c) {
		}
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
