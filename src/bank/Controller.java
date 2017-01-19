package bank;

import java.util.Scanner;
import test.Member;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String tempSsn = "";
		String gender = "";
		Member mem = null;  // 터만 잡고 공간은 없다 ( initialize 아님)     
		Account account = null;
		
		while(true){
			System.out.println("0.종료 1.회원등록 2.통장개설 3.입금 4.출금 5.조회 6.해지");
			/* int flag = s.nextInt(); */
			switch(s.nextInt()){
			case 0: return;
			case 1: 
				mem = new Member(); // initialize (값이 입력될수 있는 구조물이 들어선 상태)
				System.out.println("아이디, 이름?");
				mem.setUid(s.next());
				mem.setName(s.next());
				while(true){
					System.out.println("주민번호(앞자리7자리까지만)?");
					tempSsn = s.next();
					char ch = tempSsn.charAt(7);
					if(ch == 0 || ch == 7 || ch == 8 || ch == 9 ){
						System.out.println("다시 입력하셔요");
					}else{
						break ;
					}
				}
				mem.setSsn(tempSsn);
				break;
			case 2: 
				String uid = "";
				int money = 0 ;
				String accountType = "저축예금";
				int accountNum = 0;
				String today = "";
				String tempUid = "";
				account = new Account(uid, accountType, money);
				/* [한빛뱅크] 
				 * 계좌번호 : 123456
				 * 예금종류 : 저축예금 송상훈 
				 * 가입일 : 2016년 12월 14일
				 * 잔액 : ￦ 0
				 */
				while(true){
					System.out.println("아이디?");
					tempUid = s.next();
					if(mem.getUid().equals(tempUid)){
						break;
					}else{
						System.out.println("주민번호를 다시 입력하시오");
					}
				}
				
				StringBuffer sb = new StringBuffer();
				sb.append("["+Account.BANK_NAME+"]\n");
				sb.append("계좌번호: " + account.createAccountNo()+"\n");
				sb.append("예금종류: " + account.getAccountType()+mem.getName()+"\n");
				sb.append("가입일: " + account.today()+"\n");
				sb.append("잔액: " + account.getMoney()+"\n");
				System.out.println(sb.toString());
				
				break;
			case 3: break;
			case 4: break;
			case 5: break;
			case 6: break;
			}
		}
	}
}
