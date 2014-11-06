package solution;

import java.lang.Math;

public class Delta {
	protected long a;
	protected long b;
	protected long c;
	protected long squareOfDelta;
	protected boolean isReal;//true表示方程有实数解
	protected boolean isSingle;//true表示方程仅有一个解
	protected RealNumber delta;

	protected void setA(long a) {
		this.a = a;
	}

	protected void setB(long b) {
		this.b = b;
	}

	protected void setC(long c) {
		this.c = c;
	}

	protected long maximum(long a, long b, long c) {
		long max = a > b ? a : b;
		return max > c ? max : c;
	}

	protected Delta(long a, long b, long c) {
		long n1 = a;
		long n2 = b;
		long n3 = c;
		long finish = maximum(n1, n2, n3);
		for (long i = 2; i <= finish; i++) {//化简方程，将3个参数分别除以它们的最大公约数
			if ((n1 % i == 0) && (n2 % i == 0) && (n3 % i == 0)) {
				n1 /= i;
				n2 /= i;
				n3 /= i;
			}
		}
		a = n1;
		b = n2;
		c = n3;
		setA(a);
		setB(b);
		setC(c);
		squareOfDelta = b * b - 4 * a * c;//Δ的平方
		if (squareOfDelta == 0)//Δ的平方==0时，方程仅有一解
			isSingle = true;
		else
			isSingle = false;
		if (squareOfDelta < 0)//Δ的平方<0时，方程无实数解
			isReal = false;
		else
			isReal = true;
		delta = new RealNumber(1, Math.abs(squareOfDelta));//构造实数Δ
	}

	protected String stringOfDelta() {
		String Sdelta = delta.getRealNum();
		if (!isReal)//Δ不是实数时，后面加上i表示虚数
			Sdelta += "i";
		return Sdelta;
	}

//  测试用主函数	
//	public static void main(String[] args) {
//		Delta d = new Delta(1, -5, 6);
//		System.out.println(d.stringOfDelta());
//	}
}
