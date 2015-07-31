package api.util.vector;

import java.util.Vector;

import api.util.vector2.GradeService;

public class GradeMain {
	public static void main(String[] args) {
		GradeVO vo1 = new GradeVO();
		vo1.setEng(60);
		vo1.setHak("1501");
		vo1.setKor(70);
		vo1.setMath(50);
		vo1.setName("홍길동");
		GradeVO vo2 = new GradeVO();
		vo2.setEng(60);
		vo2.setHak("1502");
		vo2.setKor(70);
		vo2.setMath(50);
		vo2.setName("김길동");
		GradeVO vo3 = new GradeVO();
		vo3.setEng(60);
		vo3.setHak("1503");
		vo3.setKor(70);
		vo3.setMath(50);
		vo3.setName("김길동");
		GradeService service = new GradeServiceImpl();
		
		System.out.println("1501 번의 성적조회 :"
				+service.searchGradeByHak("1501"));
		// 컬렉션 내부의 <클래스타입> 을 제네릭 이라고 칭함.
		// 특별한 기능을 말하는 것은 아니고 컬렉션 내부에서
		// 타입 캐스팅을 한다라고 간단하게 정리하셔도 무방함.
		Vector<String> vc = service.searchGradeByName("김길동");
		for(int i=0;i<vc.size();i++){
			System.out.println(vc.elementAt(i));
		}
	//	service.print();
		
	}
}
