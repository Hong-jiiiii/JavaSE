package section08;

public class Method04 {
	
	public static void main(String[] args) {
		int[] values = {19,55,66,77,2,98};
		double[] result = summary(values);
		System.out.println("합계: "+result[0]);
		System.out.println("평균: "+result[1]);
	}

	public static double[] summary(int[] values) {
		
		
		//result[0] : 합계, result[1] : 평균
		double[] result = new double[2];
		
		int sum= 0;
		//확장 for문
		//for(변수 선언: 배열명) >> 변수가 배열 [0]부터 배열 마지막까지 차례로 리턴.
		
		for (double value: values) {
			sum+=value;
		} 
		//소수점 절삭
		double avg = sum/ (double)values.length;
		result[0] = sum;
		result[1] = avg;
		return result;
		
	}
	
}
