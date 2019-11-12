package sec01.exam01;

public class CompleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1/num2;
	}
	
	public void description() {
		super.description();
	}

	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다");
	}
}
