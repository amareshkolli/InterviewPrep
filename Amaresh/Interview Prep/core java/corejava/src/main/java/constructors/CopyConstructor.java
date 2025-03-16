package constructors;

public class CopyConstructor {
	
	private int var1;
	private String var2;
	
	public CopyConstructor(int var1, String var2) {
		this.var1 = var1;
		this.var2 = var2;
	}
	
	public CopyConstructor(CopyConstructor originalObj) {
		this(originalObj.var1, originalObj.var2);
	}
	
	public static void main(String[] args) {
		CopyConstructor orig = new CopyConstructor(1, "abc");
		CopyConstructor copiedObj = new CopyConstructor(orig);
		copiedObj.var1 = 10;
		
		System.out.println("orig: "+orig);
		System.out.println("copiedObj: "+copiedObj);
	}

	@Override
	public String toString() {
		return "CopyConstructor [var1=" + var1 + ", var2=" + var2 + "]";
	}
	
}
