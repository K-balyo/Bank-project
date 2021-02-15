package app;
// 으따 어렵네
public class ConstructorEx {
	/*int a;
	public ConstructorEx(String name) {
		a = 10;
	}
	public static void main(String[] args) {
		ConstructorEx obj = new ConstructorEx("이름");
		System.out.println(obj.a);
	}
	*/
    int a;
    public ConstructorEx() {
    	a = 10;
    }
    public ConstructorEx(int a) {
        a = 50;
    }
    public ConstructorEx(String a) {
    	// a = 50;
    }
    public static void main(String[] args) {
    	ConstructorEx obj1 = new ConstructorEx();
    	ConstructorEx obj2 = new ConstructorEx(10);
    	ConstructorEx obj3 = new ConstructorEx("A");
    	//System.out.println(obj.a);
    }
}
