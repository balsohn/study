package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListEx {

	public static void main(String[] args) {
		// List계열을 확인
		// Collection => List 인터페이스의 하위 클래스 => ArrayList, LinkedList, Vector, Stack
		// 순서를 가진다. 중복을 허용한다.
		
		// Collection co=new ArrayList();
		// List list=new ArrayList();
		
		ArrayList<String> ex1=new ArrayList<String>();
		LinkedList<String> ex2=new LinkedList<String>();
		Vector<String> ex3=new Vector<String>();
		Stack<String> ex4=new Stack<String>();
		
		// add() => 추가
		
		ex1.add("홍길동");
		ex1.add("배트맨");
		ex1.add("뽀로로");
		ex1.add("슈퍼맨");
		
		// size() => 데이터의 길이
		System.out.println(ex1.size());
		
		// 데이터를 읽기 => get(인덱스) : 인덱스 => 0부터 들어오는 순서대로 부여된다.
		System.out.println(ex1.get(2));
		System.out.println(ex1.get(0));
		// set(인덱스,값) => 인덱스의 해당하는 값을 변경
		ex1.set(0, "뽀로로");
		System.out.println(ex1.get(0));
	
		// indexOf("찾는값") => 찾아서 인덱스를 리턴해준다.
		int n=ex1.indexOf("배트맨");
		System.out.println(n);
		
		ex1.clear();
		
	}
}
