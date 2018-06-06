package springtest.di.ioc.annotation;

public class B {
	private C c;
	public C getC() {
		return c;
	}

	// setter注入，缺点是依赖的声明没那么明显，往往需要在文档中说明依赖关系
	public void setC(C c) {
		this.c = c;
	}
	
	public void b() {
		System.out.println("B");	
		c.c();
	}
}
