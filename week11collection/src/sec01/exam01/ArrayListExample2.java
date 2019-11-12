package sec01.exam01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayListExample2 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		
		for(int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
		}
		list.add("����");
		list.add("�θ�");
		list.add("����");
		list.add("�ϰ�");
		list.add("����");
		list.add("����");

		System.out.println("1:"+list.toString());
		list.add(1, "LA");
		print(2, list);
		
		System.out.println("3:"+list.indexOf("����"));
		System.out.println("4:"+list.lastIndexOf("����"));
		
		list.remove("LA");
		print(5, list);
		
		list.remove("2");
		print(6, list);
		
		System.out.println("7:"+list.contains("LA"));
		
		Object obj[]=list.toArray();
		System.out.println("8:"+Arrays.deepToString(obj));
		
		String cities[] = new String[0];
		cities=list.toArray(cities);
		System.out.println("9:"+Arrays.toString(cities));
		
		list.clear();
		print(10, list);
		
		System.out.println("11: "+list.isEmpty());
		
		list.add("�ĸ�");
		list.add("����");
		list.add("LA");
		
		List<String> list2=Arrays.asList("����","����", "����");
		print(12, list2);
		
		list.addAll(list2);
		print(13, list);
		
		System.out.println("14: "+list.containsAll(list2));
		
		list.retainAll(list2);
		print(15, list);
		
		list.removeAll(list2);
		print(16, list);
		
		
	}

	private static void print(int n, List<String> list) {
		// TODO Auto-generated method stub
		System.out.println(n+":"+list.toString());
		
	}

}
