package sec01.exam05;
//import 부분
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
//클래스 선언
public class HashSetExample {
	

	//메인클래스 선언부
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********로또 번호************");
		/////////////1번째 로또 번호////////////////
		//클래스호출을 이용해 객체를 생성하면 나중에 사용자 값과의 비교가 어려워 그냥 중복 구현을 했다.
		Random number=new Random();
		HashSet<String> lotto1=new HashSet<String>();
		for(int j=0;lotto1.size()<=6;j++) {
			lotto1.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum1=new ArrayList<String>(lotto1);
		Collections.sort(lottoNum1); //오름차순 생성
		
		
		Iterator<String> iter1=lotto1.iterator(); //이터레이터 객체 생성
		while(iter1.hasNext()) { //다음 객체가 있는 동안 계속 반복
			String zz=iter1.next(); //zz 문자열에 다음 객체를 받아온다
			if(zz.length()<2) { //크기가 2보다 작으면=1자리이면
				lottoNum1.remove(zz); //그 객체 삭제

				
				lottoNum1.add("0"+zz); //그 객체 앞에 0을 더해주는 문장
			}
	}
		Collections.sort(lottoNum1); //다시 오름차순 정렬
		System.out.println("A 자동 "+lottoNum1);
		
		///////////////2번째 로또 번호/////////////////////
		HashSet<String> lotto2=new HashSet<String>();
		for(int j=0;lotto2.size()<=6;j++) {
			lotto2.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum2=new ArrayList<String>(lotto2);
		Collections.sort(lottoNum2); //오름차순 생성
		
		
		Iterator<String> iter2=lotto2.iterator(); //이터레이터 객체 생성
		while(iter2.hasNext()) { //다음 객체가 있는 동안 계속 반복
			String zz=iter2.next(); //zz 문자열에 다음 객체를 받아온다
			if(zz.length()<2) { //크기가 2보다 작으면=1자리이면
				lottoNum2.remove(zz); //그 객체 삭제
//
				//System.out.println(mm);
				
				lottoNum2.add("0"+zz); //그 객체 앞에 0을 더해주는 문장
			}
	}
		Collections.sort(lottoNum2); //다시 오름차순 정렬
		System.out.println("B 자동 "+lottoNum2);
		
		//////////////3번째 로또 번호//////////////////////
		HashSet<String> lotto3=new HashSet<String>();
		for(int j=0;lotto3.size()<=6;j++) {
			lotto3.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum3=new ArrayList<String>(lotto3);
		Collections.sort(lottoNum3); //오름차순 생성
		
		
		Iterator<String> iter3=lotto3.iterator(); //이터레이터 객체 생성
		while(iter3.hasNext()) { //다음 객체가 있는 동안 계속 반복
			String zz=iter3.next(); //zz 문자열에 다음 객체를 받아온다
			if(zz.length()<2) { //크기가 2보다 작으면=1자리이면
				lottoNum3.remove(zz); //그 객체 삭제
//
				//System.out.println(mm);
				
				lottoNum3.add("0"+zz); //그 객체 앞에 0을 더해주는 문장
			}
	}
		Collections.sort(lottoNum3); //다시 오름차순 정렬
		System.out.println("C 자동 "+lottoNum3);
		
		///////////////4번째 로또 번호/////////////////////
		HashSet<String> lotto4=new HashSet<String>();
		for(int j=0;lotto4.size()<=6;j++) {
			lotto4.add(Integer.toString(number.nextInt(45)+1));
		}
		
		List<String> lottoNum4=new ArrayList<String>(lotto4);
		Collections.sort(lottoNum4); //오름차순 생성
		
		
		Iterator<String> iter4=lotto4.iterator(); //이터레이터 객체 생성
		while(iter4.hasNext()) { //다음 객체가 있는 동안 계속 반복
			String zz=iter4.next(); //zz 문자열에 다음 객체를 받아온다
			if(zz.length()<2) { //크기가 2보다 작으면=1자리이면
				lottoNum4.remove(zz); //그 객체 삭제
//
				//System.out.println(mm);
				
				lottoNum4.add("0"+zz); //그 객체 앞에 0을 더해주는 문장
			}
	}
		Collections.sort(lottoNum4); //다시 오름차순 정렬
		System.out.println("D 자동 "+lottoNum4);
		
		//////////////5번째 로또 번호//////////////////////
		HashSet<String> lotto5=new HashSet<String>();
		for(int j=0;lotto5.size()<=6;j++) {
			lotto5.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum5=new ArrayList<String>(lotto5);
		Collections.sort(lottoNum5); //오름차순 생성
		
		
		
		Iterator<String> iter5=lotto5.iterator(); //이터레이터 객체 생성
		while(iter5.hasNext()) { //다음 객체가 있는 동안 계속 반복
			String zz=iter5.next(); //zz 문자열에 다음 객체를 받아온다
			if(zz.length()<2) { //크기가 2보다 작으면=1자리이면
				lottoNum5.remove(zz); //그 객체 삭제
//
				//System.out.println(mm);
				
				lottoNum5.add("0"+zz); //그 객체 앞에 0을 더해주는 문장
			}
	}
		Collections.sort(lottoNum5); //다시 오름차순 정렬
		System.out.println("E 자동 "+lottoNum5);
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("***********당첨 번호************");
		Random number2=new Random();
		HashSet<String> lotto=new HashSet<String>();
		for(int j=0;lotto.size()<=6;j++) {
			lotto.add(Integer.toString(number2.nextInt(45)+1));
		}
		
		
		List<String> lottoNum=new ArrayList<String>(lotto);
		Collections.sort(lottoNum); //오름차순 생성
		
		
		Iterator<String> iter=lotto.iterator(); //이터레이터 객체 생성
		while(iter.hasNext()) { //다음 객체가 있는 동안 계속 반복
			String zz=iter.next(); //zz 문자열에 다음 객체를 받아온다
			if(zz.length()<2) { //크기가 2보다 작으면=1자리이면
				lottoNum.remove(zz); //그 객체 삭제
//
				//System.out.println(mm);
				
				lottoNum.add("0"+zz); //그 객체 앞에 0을 더해주는 문장
			}
	}
		Collections.sort(lottoNum); //다시 오름차순 정렬
		System.out.println(lottoNum);

		
		System.out.println("***********당첨 여부************");
		//equals연산자를 이용하여 주솟값이 아닌 객체의 내용을 비교하는 과정
		if(lottoNum.equals(lottoNum1)) {
			System.out.println("당첨되었습니다 축하합니다.");
		}
		else {
			System.out.println("당첨되지 않았습니다.");
		}
		
		if(lottoNum.equals(lottoNum2)) {
			System.out.println("당첨되었습니다 축하합니다.");
		}
		else {
			System.out.println("당첨되지 않았습니다.");
		}
		
		if(lottoNum.equals(lottoNum3)) {
			System.out.println("당첨되었습니다 축하합니다.");
		}
		else {
			System.out.println("당첨되지 않았습니다.");
		}
		
		if(lottoNum.equals(lottoNum4)) {
			System.out.println("당첨되었습니다 축하합니다.");
		}
		else {
			System.out.println("당첨되지 않았습니다.");
		}
		
		if(lottoNum.equals(lottoNum5)) {
			System.out.println("당첨되었습니다 축하합니다.");
		}
		else {
			System.out.println("당첨되지 않았습니다.");
		}
		
	
		
		
		//첫번째 생성되는 것을 사용자의 로또 번호로 가정
		//2~6번째까지는 머신의 당첨번호 5줄이다.
		
 
	}
	
	/*public class Em<T> {
		private String em;

		Em(String em){
			this.em=em;

		}
		
		public String toString() {
			return em;
		}

	}


	
	//integer가 아닌 String타입 객체로 해서 01, 02... 변환 결과 값을 변환할 필요 없이 하기로 했다
	public static void lotto_generator(int n) {
		Random number=new Random(); //랜덤 객체 number 생성
	
		
		for(int i=0;i<n;i++) { //n=6이 대입되어 7칸짜리 객체 6줄 생성
			HashSet<String> lotto=new HashSet<String>();
			
			for(int j=0;lotto.size()<=6;j++) {
				lotto.add(Integer.toString(number.nextInt(45)+1));
			}
			
			List<String> lottoNum=new ArrayList<String>(lotto);
			Collections.sort(lottoNum); //오름차순 생성
	

			
			

		
		///////////////////////////////////////////
		//로또 번호 생성 완료
		///////////////////////////////////////////
		
			Iterator<String> iter=lotto.iterator(); //이터레이터 객체 생성
			while(iter.hasNext()) { //다음 객체가 있는 동안 계속 반복
				String zz=iter.next(); //zz 문자열에 다음 객체를 받아온다
				if(zz.length()<2) { //크기가 2보다 작으면=1자리이면
					lottoNum.remove(zz); //그 객체 삭제
	//
					//System.out.println(mm);
					
					lottoNum.add("0"+zz); //그 객체 앞에 0을 더해주는 문장
				}
		}
			Collections.sort(lottoNum); //다시 오름차순 정렬
			
			//int cnt=0;
			//List<String> lottoNumX=new ArrayList<String>(lottoNum);
			//lottoNumX=lottoNum;
			//cnt++;
			System.out.println(lottoNum); //출력
			
			//////////////////////////////////////////////////////////
			//////////당첨번호와 로또번호 비교 시작 부분/////////////
			
			
			
			
			
			
			
			
			
			
		}
	}*/
	


	
	
	
	

}
