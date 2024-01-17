package hw;

public class MyExceptiion2 extends Exception {

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		String myErrMsg;
		myErrMsg = "사장님 1000만원 넘 많아요";
		
		return myErrMsg;
	} 
		
	

}

// 3. 최고임금 오류  --> MyException2 
//    사장님 1000만원 넘 많아요