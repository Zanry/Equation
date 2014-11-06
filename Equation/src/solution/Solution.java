package solution;

public class Solution extends Delta {
	private long r1;
	private long r2;
	private String numerator1;
	private String numerator2;
	private long doubleA1 = 2 * a;//Δ为有理数时，解1的分母
	private long doubleA = 2 * a;//Δ为有理数时，解2的分母 或 Δ为无理数或虚数时两个解的分母

	public Solution(long a, long b, long c) {
		super(a, b, c);
		setRoot1();
		setRoot2();
	}

	private void reduction() {//将b与无理数Δ以及2a进行约分
		long n1 = Math.abs(b);
		long n2 = delta.getRationnal();
		long n3 = doubleA;
		long finish = maximum(n1, n2, n3);
		for (long i = 2; i <= finish; i++) {
			if ((n1 % i == 0) && (n2 % i == 0) && (n3 % i == 0)) {
				n1 /= i;
				n2 /= i;
				n3 /= i;
			}
		}
		b = b<0?-n1:n1;
		delta.setRational(n2);
		doubleA = n3;
		doubleA1=doubleA;
	}

	private void setRoot1() {
		if (delta.isRational() && isReal) {//Δ为实数且为有理数时，将-b+Δ与2a进行约分
			r1 = -b + Integer.parseInt(delta.getRealNum());
			long finish = Math.abs(r1) > doubleA1 ? Math.abs(r1) : doubleA1;
			for (long i = finish; i > 1; i--) {
				if ((r1 % i == 0) && (doubleA1 % i == 0)) {
					r1 /= i;
					doubleA1 /= i;
				}
			}
		} else {
			reduction();
			if (b == 0)
				setNumerator1(stringOfDelta());
			else
				setNumerator1(-b + "+" + stringOfDelta());
		}
	}

	private void setRoot2() {//Δ为实数且为有理数时，将-b-Δ与2a进行约分
		if (delta.isRational() && isReal) {
			r2 = -b - Integer.parseInt(delta.getRealNum());
			long finish = Math.abs(r2) > doubleA ? Math.abs(r2) : doubleA;
			for (long i = finish; i > 1; i--) {
				if ((r2 % i == 0) && (doubleA % i == 0)) {
					r2 /= i;
					doubleA /= i;
				}
			}
		} else {
			reduction();
			if (b == 0)
				setNumerator2("-" + stringOfDelta());
			else
				setNumerator2(-b + "-" + stringOfDelta());
		}
	}

	public long getR1() {//获取Δ为有理数时的解1的分子的值
		return r1;
	}

	public long getR2() {//获取Δ为有理数时的解2的分子的值
		return r2;
	}

	public String getNumerator1() {//获取Δ为无理数或虚数时的解1的分子的值
		return numerator1;
	}

	private void setNumerator1(String numerator1) {
		this.numerator1 = numerator1;
	}

	public String getNumerator2() {//获取Δ为无理数或虚数时的解2的分子的值
		return numerator2;
	}

	private void setNumerator2(String numerator2) {
		this.numerator2 = numerator2;
	}

	public long getDoubleA1() {//获取Δ为有理数时，解1的分母
		return doubleA1;
	}

	public long getDoubleA() {//获取Δ为有理数时，解2的分母 或 Δ为无理数或虚数时两个解的分母
		return doubleA;
	}

}
