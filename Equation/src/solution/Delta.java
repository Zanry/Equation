package solution;

import java.lang.Math;

public class Delta {
	protected long a;
	protected long b;
	protected long c;
	protected long squareOfDelta;
	protected boolean isReal;//true��ʾ������ʵ����
	protected boolean isSingle;//true��ʾ���̽���һ����
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
		for (long i = 2; i <= finish; i++) {//���򷽳̣���3�������ֱ�������ǵ����Լ��
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
		squareOfDelta = b * b - 4 * a * c;//����ƽ��
		if (squareOfDelta == 0)//����ƽ��==0ʱ�����̽���һ��
			isSingle = true;
		else
			isSingle = false;
		if (squareOfDelta < 0)//����ƽ��<0ʱ��������ʵ����
			isReal = false;
		else
			isReal = true;
		delta = new RealNumber(1, Math.abs(squareOfDelta));//����ʵ����
	}

	protected String stringOfDelta() {
		String Sdelta = delta.getRealNum();
		if (!isReal)//������ʵ��ʱ���������i��ʾ����
			Sdelta += "i";
		return Sdelta;
	}

//  ������������	
//	public static void main(String[] args) {
//		Delta d = new Delta(1, -5, 6);
//		System.out.println(d.stringOfDelta());
//	}
}
