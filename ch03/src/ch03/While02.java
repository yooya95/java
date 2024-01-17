package ch03;

import java.io.IOException;

public class While02 {

	public static void main(String[] args) throws IOException {
		System.out.println("보고싶은 구구단은?");
		//시스템 키보드 값 읽어드림	
		int num = System.in.read()-'0'; 
		//이게 한자리 수라고 가정했을때인데... 
		// 만약 2자리 입력했을 때는 어떻게 다 보이게 하지? (모르겠음!)
	
		System.out.println("num ->" + num);
		// hw2 : while + if
		// num이 2단에서 9단 사이일때 조회
		// 아니면 구구단에 업는 숫자입니다 message 출력
		int i =1;
			if(num>=2) {
				while(i<=9) {
				System.out.println(num + " * " +i+ " = "+num*i);
				i++;
				}
			}
			else {
				System.out.println("구구단에 없는 숫자입니다");
			}	
			
		
			
		}
		
		}			
	


