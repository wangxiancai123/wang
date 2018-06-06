package springtest.di.manual;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C cc = new C();
		B bb = new B();
		bb.setC(cc);
		A aa = new A(bb);
		aa.a();
		
	}

}
