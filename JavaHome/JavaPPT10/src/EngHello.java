class Greeting{
	public String name = "ȫ�浿";
	public void sayHello() {
		System.out.println("�� �ȳ��ϼ���");
	}
}
public class EngHello extends Greeting{	
	public String name = "Mr.Hong";
	public void sayHello() {
		System.out.println(name+"Nice to meet you");
	}
	public void test() {
		System.out.println(super.name);
		super.sayHello();
	}
	public static void main(String[] args) {
		EngHello eng = new EngHello();
		eng.sayHello();
		eng.test();
	}
}
