package solution;

public class RealNumber {

	private long rational;
	private String sRational;
	private long irrational;
	private String sIrrational;
	private String RealNum;

	public RealNumber(long rational, long irrational) {
		setRational(rational);
		setIrrational(irrational);
		normalize();
	}

	private void normalize() {//将无理数规格化，例如将√8规格化为2√2
		long finish = irrational;
		for (long i = finish; i > 1; i--) {
			if (irrational % (i * i) == 0) {//如果根号下的数可以整除i的平方
				irrational = irrational / (i * i);//无理数部分除以i的平方
				rational *= i;//有理数部分乘以i
			}
		}
	}

	private void format() {//该方法目的是将形如0√2,2√0,1√2,2√1这样的数按照一般的书写习惯格式化，分别转化为0,0,√2,2
		if (irrational == 0 || rational == 0) {
			sRational = "0";
			sIrrational = "";
		} else {
			if (rational == 1)
				sRational = "";
			else
				sRational = Long.toString(rational);
			if (irrational == 1){
				if (rational == 1)
					sIrrational = "1";
				else
					sIrrational = "";
			}
			else
				sIrrational = "√" + Long.toString(irrational);
		}
		RealNum = sRational + sIrrational;
	}

	public boolean isRational() {//判断该实数是否为无理数，格式化后包含“√”的即为无理数

		format();
		if (RealNum.indexOf('√') != -1)
			return false;
		else
			return true;
	}

	public void setRational(long rational) {
		this.rational = rational;
	}

	public long getRationnal() {
		return rational;
	}

	private void setIrrational(long irrational) {
		this.irrational = irrational;
	}

	public String getRealNum() {
		format();
		return RealNum;
	}

//  测试用主函数	
//	public static void main(String[] args) {
//		RealNumber irr = new RealNumber(1, 48);
//		System.out.println(irr.getRealNum());
//	}
}
