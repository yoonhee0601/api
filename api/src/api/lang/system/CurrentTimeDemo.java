package api.lang.system;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.lang.System 에 속한
 * currentTimeMillis() 은
 * ROM 에 내장된 시간을 리턴한다.
 * */
public class CurrentTimeDemo {
	public static void main(String[] args) {
		long curTime = System.currentTimeMillis();
		System.out.println("curTime : " + curTime);
		SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
		/*
		 * new Date() 시에 import 제안이 두가지 인데
		 * 그중 java.util.Date 를 선택한다.
		 * */ 
		String nowTime = sdf.format(new Date(curTime));
		System.out.println("현재시간 :" + nowTime);
	}
}
