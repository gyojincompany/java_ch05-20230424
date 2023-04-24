package abstractEx;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int sum = a + b;
		return sum;
	}

	@Override
	public int subtract(int a, int b) {
		// TODO Auto-generated method stub
		int sub = a - b;
		return sub;
	}

	@Override
	public double aveage(int[] a) {
		// TODO Auto-generated method stub
		double sum=0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];//배열내의 모든 원소들의 합
		}
		
		double ave = sum / a.length;//배열내 모든 원소들의 평균
		
		return ave;
	}
	
	
}
