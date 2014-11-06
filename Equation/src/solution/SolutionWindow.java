package solution;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

;

public class SolutionWindow {

	private JFrame frmprogrammer;
	private JTextField textField_a;
	private JTextField textField_b;
	private JTextField textField_c;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SolutionWindow window = new SolutionWindow();
					window.frmprogrammer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SolutionWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmprogrammer = new JFrame();
		frmprogrammer.setTitle("\u81EA\u52A8\u6C42\u89E3\u4E00\u5143\u4E8C\u6B21\u6574\u5F0F\u65B9\u7A0B(Programmer:\u674E\u5965)");
		frmprogrammer.setBounds(100, 100, 600, 420);
		frmprogrammer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmprogrammer.getContentPane().setLayout(null);
		frmprogrammer.setResizable(false);

		textField_a = new JTextField();
		textField_a.setBounds(90, 66, 66, 30);
		frmprogrammer.getContentPane().add(textField_a);
		textField_a.setColumns(10);

		textField_b = new JTextField();
		textField_b.setBounds(230, 66, 66, 30);
		frmprogrammer.getContentPane().add(textField_b);
		textField_b.setColumns(10);

		textField_c = new JTextField();
		textField_c.setBounds(370, 66, 66, 30);
		frmprogrammer.getContentPane().add(textField_c);
		textField_c.setColumns(10);

		JLabel lblNewLabel_a = new JLabel("a=");
		lblNewLabel_a.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_a.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_a.setBounds(30, 73, 54, 15);
		frmprogrammer.getContentPane().add(lblNewLabel_a);

		JLabel lblNewLabel_b = new JLabel("b=");
		lblNewLabel_b.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_b.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_b.setBounds(170, 73, 54, 15);
		frmprogrammer.getContentPane().add(lblNewLabel_b);

		JLabel lblNewLabel_c = new JLabel("c=");
		lblNewLabel_c.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblNewLabel_c.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_c.setBounds(310, 73, 54, 15);
		frmprogrammer.getContentPane().add(lblNewLabel_c);

		lblNewLabel_3 = new JLabel(
				"\u8F93\u5165\u8981\u6C42\u89E3\u7684\u4E00\u5143\u4E8C\u6B21\u65B9\u7A0B\u7684\u4E09\u4E2A\u6574\u6570\u53C2\u6570\uFF08-999~999\u4E14a\u4E0D\u7B49\u4E8E0\uFF09\uFF1A");
		lblNewLabel_3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(46, 21, 507, 35);
		frmprogrammer.getContentPane().add(lblNewLabel_3);

		final JLabel lblMsg = new JLabel("");
		lblMsg.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		lblMsg.setBounds(60, 106, 406, 35);
		frmprogrammer.getContentPane().add(lblMsg);

		final JLabel lblx11 = new JLabel("X");
		lblx11.setHorizontalAlignment(SwingConstants.RIGHT);
		lblx11.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblx11.setBounds(60, 200, 14, 20);
		frmprogrammer.getContentPane().add(lblx11);

		final JLabel lblx12 = new JLabel("1");
		lblx12.setVerticalAlignment(SwingConstants.BOTTOM);
		lblx12.setFont(new Font("微软雅黑", Font.BOLD, 12));
		lblx12.setBounds(74, 202, 14, 20);
		frmprogrammer.getContentPane().add(lblx12);

		final JLabel lblx13 = new JLabel("=");
		lblx13.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblx13.setBounds(84, 200, 20, 20);
		frmprogrammer.getContentPane().add(lblx13);

		final JLabel lblx21 = new JLabel("X");
		lblx21.setHorizontalAlignment(SwingConstants.RIGHT);
		lblx21.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblx21.setBounds(60, 270, 14, 20);
		frmprogrammer.getContentPane().add(lblx21);

		final JLabel lblx22 = new JLabel("2");
		lblx22.setVerticalAlignment(SwingConstants.BOTTOM);
		lblx22.setFont(new Font("微软雅黑", Font.BOLD, 12));
		lblx22.setBounds(74, 272, 14, 20);
		frmprogrammer.getContentPane().add(lblx22);

		final JLabel lblx23 = new JLabel("=");
		lblx23.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblx23.setBounds(84, 270, 20, 20);
		frmprogrammer.getContentPane().add(lblx23);

		final JLabel lblseperate2 = new JLabel(
				"\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
		lblseperate2.setHorizontalAlignment(SwingConstants.CENTER);
		lblseperate2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblseperate2.setBounds(111, 273, 200, 15);
		frmprogrammer.getContentPane().add(lblseperate2);

		final JLabel lblseperate1 = new JLabel(
				"\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
		lblseperate1.setHorizontalAlignment(SwingConstants.CENTER);
		lblseperate1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblseperate1.setBounds(111, 203, 200, 15);
		frmprogrammer.getContentPane().add(lblseperate1);

		final JLabel lblnumerator1 = new JLabel(
				"\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
		lblnumerator1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumerator1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblnumerator1.setBounds(111, 185, 200, 15);
		frmprogrammer.getContentPane().add(lblnumerator1);

		final JLabel lbldenominator1 = new JLabel(
				"\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
		lbldenominator1.setHorizontalAlignment(SwingConstants.CENTER);
		lbldenominator1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lbldenominator1.setBounds(111, 221, 200, 15);
		frmprogrammer.getContentPane().add(lbldenominator1);

		final JLabel lblnumerator2 = new JLabel(
				"\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
		lblnumerator2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnumerator2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblnumerator2.setBounds(111, 255, 200, 15);
		frmprogrammer.getContentPane().add(lblnumerator2);

		final JLabel lbldenominator2 = new JLabel(
				"\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014\u2014");
		lbldenominator2.setHorizontalAlignment(SwingConstants.CENTER);
		lbldenominator2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lbldenominator2.setBounds(111, 291, 200, 15);
		frmprogrammer.getContentPane().add(lbldenominator2);

		final JLabel lblresult1 = new JLabel("|||||||||||||||");
		lblresult1.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblresult1.setBounds(111, 203, 200, 15);
		frmprogrammer.getContentPane().add(lblresult1);

		final JLabel lblresult2 = new JLabel("|||||||||||||||");
		lblresult2.setFont(new Font("微软雅黑", Font.BOLD, 20));
		lblresult2.setBounds(111, 273, 200, 15);
		frmprogrammer.getContentPane().add(lblresult2);

		lblx11.setVisible(false);
		lblx12.setVisible(false);
		lblx13.setVisible(false);
		lblx21.setVisible(false);
		lblx22.setVisible(false);
		lblx23.setVisible(false);
		lblresult1.setVisible(false);
		lblresult2.setVisible(false);
		lblnumerator1.setVisible(false);
		lblnumerator2.setVisible(false);
		lbldenominator1.setVisible(false);
		lbldenominator2.setVisible(false);
		lblseperate1.setVisible(false);
		lblseperate2.setVisible(false);

		JButton btnNewButton = new JButton("\u6C42\u89E3");
		btnNewButton.addActionListener(new ActionListener() {//点击求解按钮后发生的事件
			public void actionPerformed(ActionEvent arg0) {

				lblx11.setVisible(false);
				lblx12.setVisible(false);
				lblx13.setVisible(false);
				lblx21.setVisible(false);
				lblx22.setVisible(false);
				lblx23.setVisible(false);
				lblresult1.setVisible(false);
				lblresult2.setVisible(false);
				lblnumerator1.setVisible(false);
				lblnumerator2.setVisible(false);
				lbldenominator1.setVisible(false);
				lbldenominator2.setVisible(false);
				lblseperate1.setVisible(false);
				lblseperate2.setVisible(false);

				if (textField_a.getText().matches("\\-?[0-9]{1,3}")
						&& textField_b.getText().matches("\\-?[0-9]{1,3}")
						&& textField_c.getText().matches("\\-?[0-9]{1,3}")) {//用正则表达式限制三个参数为a∈[-999,0)∪(0,999]b∈[-999,999]c∈[-999,999]的整数
					long a = Long.parseLong(textField_a.getText());
					if (a != 0) {
						long b = Long.parseLong(textField_b.getText());
						long c = Long.parseLong(textField_c.getText());
						if (a < 0) {//将-ax^2+bx+c=0化为ax^2-bx-c=0的标准形式
							a = -a;
							b = -b;
							c = -c;
						}
						lblx11.setVisible(true);
						lblx12.setVisible(true);
						lblx13.setVisible(true);
						lblx21.setVisible(true);
						lblx22.setVisible(true);
						lblx23.setVisible(true);
						String A;
						String B;
						String C;
						if (a == 1)//将形如1x^2+0x-2=0化为x^2-2=0的标准形式
							A = "";
						else
							A = Long.toString(a);
						if (b < 0)
							B = Long.toString(b) + "x";
						else if (b == 0)
							B = "";
						else
							B = "+" + Long.toString(b) + "x";
						if (c < 0)
							C = Long.toString(c);
						else if (c == 0)
							C = "";
						else
							C = "+" + Long.toString(c);
						Solution equ = new Solution(a, b, c);
						if (equ.getDoubleA1() == 1 && equ.getDoubleA() == 1) {//以下四个分支主要目的是当解的分母为1时，分母与分割线不显示，只显示分子
							if (equ.delta.isRational() && equ.isReal) {
								lblresult1.setText(Long.toString(equ.getR1()));
								lblresult2.setText(Long.toString(equ.getR2()));
							} else {
								lblresult1.setText(equ.getNumerator1());
								lblresult2.setText(equ.getNumerator2());
							}
							lblresult1.setVisible(true);
							lblresult2.setVisible(true);
						} else if (equ.getDoubleA1() != 1
								&& equ.getDoubleA() == 1) {
							if (equ.delta.isRational() && equ.isReal) {
								lblnumerator1.setText(Long.toString(equ.getR1()));
								lblresult2.setText(Long.toString(equ.getR2()));
							} else {
								lblnumerator1.setText(equ.getNumerator1());
								lblresult2.setText(equ.getNumerator2());
							}
							lbldenominator1.setText(Long.toString(equ
									.getDoubleA1()));
							lblnumerator1.setVisible(true);
							lbldenominator1.setVisible(true);
							lblseperate1.setVisible(true);
							lblresult2.setVisible(true);
						} else if (equ.getDoubleA1() == 1
								&& equ.getDoubleA() != 1) {
							if (equ.delta.isRational() && equ.isReal) {
								lblresult1.setText(Long.toString(equ.getR1()));
								lblnumerator2.setText(Long.toString(equ.getR2()));
							} else {
								lblresult1.setText(equ.getNumerator1());
								lblnumerator2.setText(equ.getNumerator2());
							}
							lblresult1.setVisible(true);
							lbldenominator2.setText(Long.toString(equ
									.getDoubleA()));
							lblnumerator2.setVisible(true);
							lbldenominator2.setVisible(true);
							lblseperate2.setVisible(true);
						} else {
							if (equ.delta.isRational() && equ.isReal) {
								lblnumerator1.setText(Long.toString(equ.getR1()));
								lblnumerator2.setText(Long.toString(equ.getR2()));
							} else {
								lblnumerator1.setText(equ.getNumerator1());
								lblnumerator2.setText(equ.getNumerator2());
							}
							lbldenominator1.setText(Long.toString(equ
									.getDoubleA()));
							lbldenominator2.setText(Long.toString(equ
									.getDoubleA()));
							lblnumerator1.setVisible(true);
							lblnumerator2.setVisible(true);
							lbldenominator1.setVisible(true);
							lbldenominator2.setVisible(true);
							lblseperate1.setVisible(true);
							lblseperate2.setVisible(true);
						}
						if (!equ.isSingle)//根据方程有一个或两个解来控制结果的显示。
							lblMsg.setText("方程" + A + "x^2" + B + C
									+ "=0 有两个解：");
						else {
							lblMsg.setText("方程" + A + "x^2" + B + C
									+ "=0 仅有一解：");
							lblx12.setVisible(false);
							lblx21.setVisible(false);
							lblx22.setVisible(false);
							lblx23.setVisible(false);
							lblresult2.setVisible(false);
							lblnumerator2.setVisible(false);
							lbldenominator2.setVisible(false);
							lblseperate2.setVisible(false);
						}
					} else {
						lblMsg.setText("输入的参数不正确，请重新输入！");
						lblMsg.setVisible(true);
					}
				} else {
					lblMsg.setText("输入的参数不正确，请重新输入！");
					lblMsg.setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("微软雅黑", Font.BOLD, 16));
		btnNewButton.setBounds(460, 66, 93, 30);
		frmprogrammer.getContentPane().add(btnNewButton);
	}
}
