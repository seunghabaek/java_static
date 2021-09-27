class Accounting2 { // 연관된 변수와 method를 묶어서 class화
	public double valueOfSupply;	
	public static double vatRate = 0.1;
	public Accounting2(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
	}
	public double getVAT() {
		return valueOfSupply*vatRate;
	}
	
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}
public class AccountingAppInstance {
	public static void main(String[] args) {	
		Accounting2 a1 = new Accounting2(10000.0);
		
		Accounting2 a2 = new Accounting2(20000.0);
		
		System.out.println("Value of supply :"+a1.valueOfSupply);
		System.out.println("Value of supply :"+a2.valueOfSupply);
		
		System.out.println("VAT :"+a1.getVAT());
		System.out.println("VAT :"+a2.getVAT());
		
		System.out.println("Total :"+a1.getTotal() );
		System.out.println("Total :"+a2.getTotal() );
		
		
	}

}
