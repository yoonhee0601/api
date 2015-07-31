package api.util.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GradeSortMain {
	public static void main(String[] args) {
		List<GradeVO> grades = new ArrayList<GradeVO>();
		
		GradeVO g1 = new GradeVO("2011","홍길동",90,80,70);
		GradeVO g2 = new GradeVO("2012","김길동",20,20,20);
		GradeVO g3 = new GradeVO("2013","장길동",60,60,60);
		GradeVO g4 = new GradeVO("2014","문길동",90,90,90);
		
		 grades.add(g1);
		 grades.add(g2);
		 grades.add(g3);
		 grades.add(g4);
		 /*
		  * anonymous 생성자 처리 : 단 한 번만 쓰고 버리겠다.
		  * */
		 grades.add(new GradeVO("2014","최길동",90,90,90));
		 
		
		System.out.println("이름 오름차순 정렬");
		Collections.sort(grades,new NameAscCompareImpl());
		for(GradeVO grade : grades){
			// System.out.println(grade);
		}
		System.out.println("이름 내림차순 정렬");
		Collections.sort(grades,new NameDescCompareImpl());
		for(GradeVO grade : grades){
			// System.out.println(grade);
		}
		System.out.println("총점 오름차순 정렬");
		Collections.sort(grades, new TotalAscCompareImpl());
		for(GradeVO grade: grades){
			 System.out.println(grade);
		}
		System.out.println("총점 내림차순 정렬");
		Collections.sort(grades, new TotalDescCompareImpl());
		for(GradeVO grade: grades){
			// System.out.println(grade);
		}
	}
}
