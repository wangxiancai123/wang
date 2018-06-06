package springtest.di.ioc.xml;

public class A {
	private B b;
	
	public A(B bb){
		
		this.b=bb;
	}
	public void a() {
		System.out.println("咸菜大魔王A");
		b.b();
	}
}
