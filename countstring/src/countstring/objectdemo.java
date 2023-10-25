package countstring;

public class objectdemo {
	private int value;
	public objectdemo(int value) {
		this.value=value;
	}
	public int getValue() {
		return value;
	}

public void method1() {
	objectdemo obj=new objectdemo(42);
	method2(obj);
	
}
private void method2(objectdemo obj) {
	// TODO Auto-generated method stub
	int value=obj.getValue();
	System.out.println(value);
}

}
