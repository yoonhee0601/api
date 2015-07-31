package api.util.collections;

import java.util.Vector;

import api.util.vector.GradeVO;

public interface GradeService {
	/*
	 * vo 객체를 벡터에 저장하는 기능
	 * */
	public void input(GradeVO vo);
	/**/
	public void print();
	
	/*
	 * 학번을 이용해서 성적표를 출력 ==> complete !!
	 * */
	public String searchGradeByHak(String hak);
	/*
	 * 이름을 이용한 성적출력인데 동명이인 케이스까지 커버하기 위해
	 * 리턴값을 벡터로 받아야 겠다.
	 * */
	public Vector<String> searchGradeByName(String name);
	public void descGradeTotal();
	public void ascGradeTotal();
}
