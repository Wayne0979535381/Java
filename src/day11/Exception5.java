package day11;

public class Exception5 {
	
	public static void main(String[] args) {
		
		try {
			action();
			
		} catch (ArithmeticException |  ArrayIndexOutOfBoundsException e) {
			System.out.println("數學或陣列錯誤");
			System.out.println("錯誤原因:" + e.getMessage());
		} catch (Exception e) {
			System.out.println("其他錯誤");
			System.out.println("錯誤原因:" + e.getMessage());
			return;
		}finally {
			System.out.println("程式結束");	
		}
		
	}
	
	
	
     public static void action() {
		
		int[] arr = {10, 0, 5, 2};
		
			int a = arr[0]; // 分子
			int b = arr[4]; // 分母
			
			int result = a / b;
			
			System.out.println(result);
			
		
	}
}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
	


