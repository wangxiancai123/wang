package springtest.di.manual;

public class A {
	private B b;
	
	public A(B bb){
		
		this.b=bb;
	}
	public void a() {
		System.out.println("A");
		b.b();
	}
}
