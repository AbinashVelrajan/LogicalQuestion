package org.logic;

import java.io.EOFException;
import java.io.IOException;

import org.logic.Q8.Super;

class Q1 {
	Q1() {
		String x = "xyz";
		x.toUpperCase(); /* Line 2 */
		String y = x.replace('Y', 'y');
		y = y + "abc";
		System.out.println(y);
	}
}

class Q2 {
//	class A {
//		public A(int x) {}
//	}
//	
//	class B extends A {}
//
//	Q2() {
//		A a = new B();
//		System.out.println("complete");
//	}
}

class Q3 {
	Q3() {
		int i = 1, j = 10;
		do {
			if(i++ > --j) {
				continue;
			}
		}while(i < 5);
		
		System.out.println("i = " + i + " and j = " + j);
	}
}

class Q4 {
	static int j;
	static void methodA(int i) {
		boolean b;
		
		do {
			b = i < 10 | methodB(4); /* Line 9 */
			b = i < 10 || methodB(8); /* Line 10 */
		}while(!b);
	}
	
	static boolean methodB(int i) {
		j += i;
		return true;
	}
	
	Q4() {
		methodA(0);
		System.out.println("j = " + j);
	}
}

class Q5 {
	public static void stringReplace(String text) {
		text = text.replace('j', 'c');
	}
	
	public static void bufferReplace(StringBuffer text) {
		text = text.append("c");
	}
	
	Q5() {
		String textString = new String("java");
		StringBuffer textBuffer = new StringBuffer("java"); /* Line 14 */
		
		stringReplace(textString);
		bufferReplace(textBuffer);
		
		System.out.println(textString + textBuffer);
	}
}

class Q6 {
	class Tree {}
	class Pine extends Tree {}
	class Oak extends Tree {}
	
	Q6() {
		Tree tree = new Pine();
		
		if (tree instanceof Pine) {
			System.out.println("Pine");
		} else if (tree instanceof Tree) {
			System.out.println("Tree");
		} else if (tree instanceof Oak) {
			System.out.println("Oak");
		} else {
			System.out.println("Oops");
		}
	}
}

class Q7 {
	Q7() {
		final StringBuffer a = new StringBuffer();
		final StringBuffer b = new StringBuffer();
		
		new Thread() {
			public void run() {
				System.out.println(a.append("A"));
				synchronized (b) {
					System.out.println(b.append("B"));
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				System.out.println(b.append("C"));
				synchronized (a) {
					System.out.println(a.append("D"));
				}
			}
		}.start();
	}
}

class Q8 {
	class Super {
		public int index = 1;
	}
	
	class App extends Super {
		public App(int index) {
			index = index;
		}
	}
	
	Q8() {
		App myApp = new App(10);
		System.out.println(myApp.index);
	}
}

class Q9 {
	Q9() {
		try {
			System.out.printf("1");
			int value = 10 / 0;
			throw new IOException();
		} catch (EOFException e) {
			System.out.printf("2");
		} catch (ArithmeticException e) {
			System.out.printf("3");
		} catch (NullPointerException e) {
			System.out.printf("4");
		} catch (IOException e) {
			System.out.printf("5");
		} catch (Exception e) {
			System.out.printf("6");
		}
	}
}

class Q10 {
	class A {}
	class B extends A {}
	class C extends B {}
	
	static void overloadedMain(A a) {
		System.out.println("ONE");
	}
	
	static void overloadedMain(B b) {
		System.out.println("TWO");
	}
	
	static void overloadedMain(C c) {
		System.out.println("THREE");
	}
	
	Q10() {
		C c = new C();
		overloadedMain(c);
	}
}

class Q11 {
	class SuperClass {
		void superClassMethod(Number n) {
			System.out.println("From Super Class");
		}
	}
	
	class SubClass extends SuperClass {
		void superClassMethod(Double d) {
			System.out.println("From Sub Class");
		}
	}
	
	Q11() {
		SubClass sub = new SubClass();
		
		sub.superClassMethod(123321);
	}
}

class Q12 {
	class A {
		public A(int i) {
			System.out.println(1);
		}
		
		public A() {
			this(10);
			System.out.println(2);
		}
		
		void A() {
			A(10);
			System.out.println(3);
		}
		
		void A(int i) {
			System.out.println(4);
		}
	}
	
	Q12() {
		new A().A();
	}
}

class Q13 {
//	abstract class demo {
//		public int a;
//		demo() {
//			a = 10;
//		}
//		
//		abstract public void set();
//		abstract final public void get();
//	}
//	
//	class Test extends demo {
//		public void set(int a) {
//			this.a = a;
//		}
//		
//		final public void get() {
//			System.out.println("a = " + a);
//		}
//	}
//	
//	Q13() {
//		Test obj = new Test();
//		obj.set(20);
//		obj.get();
//	}
}

class Q14 {
	class Test {
		public Test() {
			System.out.printf("1");
			new Test(10);
			System.out.println("5");
		}
		
		public Test(int temp) {
			System.out.printf("2");
			new Test(10, 20);
			System.out.printf("4");
		}
		
		public Test(int data, int temp) {
			System.out.printf("3");
		}
	}
	
	Q14() {
		Test Obj = new Test();
	}
}

public class SoftSavueInterviewQuestions {
	static void printLine() {
		System.out.println("========================================");
	}
	public static void main(String[] args) {
//		printLine();
//		Q1 q1 = new Q1();
//		printLine();
		
		
		
//		printLine();
//		new Q2();
//		printLine();
		
//		printLine();
//		new Q3();
//		printLine();
		
//		printLine();
//		new Q4();
//		printLine();
		
//		printLine();
//		new Q5();
//		printLine();
//		
//		printLine();
//		new Q6();
//		printLine();
//		
//		printLine();
//		new Q7();
//		printLine();
//		
//		printLine();
//		new Q8();
//		printLine();
//		
//		printLine();
//		new Q9();
//		printLine();
//		
//		printLine();
//		new Q10();
//		printLine();
//		
//		printLine();
//		new Q11();
//		printLine();
//		
//		printLine();
//		new Q12();
//		printLine();
//		
//		printLine();
//		new Q13();
//		printLine();
//		
//		printLine();
//		new Q14();
//		printLine();
		
	}
}
