package api.util.vector;

import java.util.Vector;

import api.util.vector2.GradeService;

public class GradeServiceImpl implements GradeService{

	private Vector<GradeVO> grades = new Vector<GradeVO>();
	
	
	/*
	 * 성적표를 출력하는 메소드
	 * vo.toString() 으로 처리 예상하고 있음.
	 * */
	@Override
	public void print() {
		for(int i=0;i<grades.size();i++){
			System.out.println(grades.elementAt(i).toString());
		}
	}
	/*
	 * 학번으로 검색하는 기능을 가진 메소드
	 * */
	@Override
	public String searchGradeByHak(String hak) {
		// GradeVO vo = new GradeVO();
		// 벡터는 size() 로 limit 을 표시함
		// 확장된 for 문은 조건식 타입이 (타입 참조변수 : 컬렉션)
		String result = "";
		for(GradeVO vo : grades){
			if(vo.getHak().equalsIgnoreCase(hak)){
				result = vo.toString();
			}else{
				result = "조회된 학번에 해당하는 학생이 없습니다.";
			}
		}
		return result;
		
	}
	/*
	 * 이름으로 성적을 검색해서 출력하는 메소드
	 * */
	@Override
	public Vector<String> searchGradeByName(String name) {
		Vector<String> vc = new Vector<String>();
		// 벡터나 기타 컬렉션 출력을 하게 되면..
		// 이터레이터 아니면 확장 for 문으로 처리한다.
		// 왜냐면 확장 for 문은 인덱스를 따지지 않기 때문..무조건 전체 출력
		/*
		 * grades 를 쓸 수 있는 이유는 멤버필드에 선언하여
		 * 같은 클래스 내부의 메소드들이 값을 공유하기 때문이다.
		 * */
		for(GradeVO vo : grades){
			if(vo.getName().equalsIgnoreCase(name)){
				/*
				 * 파라미터로 넘어온 이름과 동일한 VO 객체를 
				 * 찾아서 String 형태로 벡터에 저장한다.
				 * 즉 vc 는 String 타입이란 것 주의하세요 !!
				 * GradeVO 타입이 아닙니다.
				 * */
				vc.add(vo.toString()); 
			}
		}
		return vc; // 리턴값은 성적 정보를 저장한 벡터이다.
	}
	/*
	 * 종합점수 기준으로 내림차순으로 정렬시키는 메소드
	 * */
	@Override
	public void descGradeTotal() {
		
	}
	/*
	 * 종합점수 기준으로 오름차순으로 정렬시키는 메소드
	 * */
	@Override
	public void ascGradeTotal() {
		
	}
	@Override
	public void input(api.util.vector2.GradeVO vo) {
		// TODO Auto-generated method stub
		
	}

}
