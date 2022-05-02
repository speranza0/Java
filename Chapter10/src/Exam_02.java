import java.text.DecimalFormat;

/*
 * java.text.DecimalFormat
 * 
 * 금액 단위에 콤마찍기
 * ###,###
 * 
 * 소수 출력
 * .##
 * 
 * */
public class Exam_02 {
	public static void main(String[] args) {
		long money = 3029482412356L;
		
		DecimalFormat df = new DecimalFormat("###,###");
		String moneyStr = df.format(money);
		
		System.out.println(moneyStr);
		
		double doub = 3.141592;
		DecimalFormat df2 = new DecimalFormat(".###");
		String doubStr = df2.format(doub);
		
		System.out.println(doubStr);
	}
}
