package ch10;

public class MyException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		// return super.getMessage();
		String myErrMsg;
		// 10보다 크다니
		myErrMsg = "아니 10보다 크다니";
		
		return myErrMsg;
	}
}
