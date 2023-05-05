package Punto1;

class DynamicDispatch {
		DynamicDispatch() {
			A a = new A();
			B b = new B();
			C c = new C();
			A ref;

			ref = b;
			ref.callthis();
			ref = c;
			ref.callthis();

			ref = a;
			ref.callthis();
		
		}
}
