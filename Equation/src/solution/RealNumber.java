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

	private void normalize() {//����������񻯣����罫��8���Ϊ2��2
		long finish = irrational;
		for (long i = finish; i > 1; i--) {
			if (irrational % (i * i) == 0) {//��������µ�����������i��ƽ��
				irrational = irrational / (i * i);//���������ֳ���i��ƽ��
				rational *= i;//���������ֳ���i
			}
		}
	}

	private void format() {//�÷���Ŀ���ǽ�����0��2,2��0,1��2,2��1������������һ�����дϰ�߸�ʽ�����ֱ�ת��Ϊ0,0,��2,2
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
				sIrrational = "��" + Long.toString(irrational);
		}
		RealNum = sRational + sIrrational;
	}

	public boolean isRational() {//�жϸ�ʵ���Ƿ�Ϊ����������ʽ����������̡��ļ�Ϊ������

		format();
		if (RealNum.indexOf('��') != -1)
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

//  ������������	
//	public static void main(String[] args) {
//		RealNumber irr = new RealNumber(1, 48);
//		System.out.println(irr.getRealNum());
//	}
}
