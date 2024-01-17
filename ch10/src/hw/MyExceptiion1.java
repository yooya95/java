package hw;

public class MyExceptiion1 extends Exception {

	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		//return super.getMessage();
		String myErrMsg;
		myErrMsg = "사장님 150만원보다 적어요!!";
		
		return myErrMsg;
	} 
		
	

}



// 2. 최저임금 오류  --> MyException1
//    사장님 150만원 보다 적어요 !! 이 뭡니다