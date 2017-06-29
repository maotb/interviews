package main.java.Chapter_07.Section_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Example3 {
	public static void main(String[] args) {
		//为了测试性能，字符串写的很长。
		String input ="avzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzc"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh"
				+ "adfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdhshgWasdfasdfffffdddaaaavzcadfdsfsdh";
		Long time1 = new Date().getTime();
		new Example3().doString2(input);
		Long time2 = new Date().getTime();
		new Example3().doString(input);
		Long time3 = new Date().getTime();
		System.out.println("#################################");
		System.out.println(time2 - time1);
		System.out.println(time3 - time2);
	}
	
	/**
	 * 自己的写法
	 * 思路：
	 * （1）将字符串转换成char数组
	 * （2）将char放入map中，以char为key，char出现的次数为value。
	 * （3）用max记录出现最多的次数
	 * （4）遍历map找出最大次数和出现最多的字符
	 * @param input
	 */
	public void doString2(String input){
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] chars = input.toCharArray();
		
		Integer max = 0;
		
		for (char c : chars) {
			Integer count = map.get(c);
			count = count ==null?1:++count;
			map.put(c, count);
			if(count>max){
				max = count;
			}
		}
		
		System.out.println("max "+ max);
		
		Set<Character> set = map.keySet();
		for (Character c : set) {
			if(max.compareTo(map.get(c))==0){
				System.out.println("max data "+c);
			}
		}
		
	}
	
	/**
	 * 书中的写法
	 * @param input
	 */
	public void doString(String input){
		char[] chars = input.toCharArray();
		ArrayList lists = new ArrayList<>();
		TreeSet set = new TreeSet<>();
		for (int i = 0; i < chars.length; i++) {
			lists.add(String.valueOf(chars[i]));
			set.add(String.valueOf(chars[i]));
		}
//		System.out.println(set);
		Collections.sort(lists);
//		System.out.println(lists);
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < lists.size(); i++) {
			sb.append(lists.get(i));
		}
		
		input =sb.toString();
//		System.out.println(input);
		
		int max = 0 ;
		String maxString = "";
		ArrayList maxlist = new ArrayList<>();
		
		Iterator its =set.iterator();
		while (its.hasNext()) {
			String os = (String) its.next();
			int begin = input.indexOf(os);
			int end = input.lastIndexOf(os);
			int value = end -begin +1;
			if(value > max){
				max = value;
				maxString = os;		//记录最长的字符串第一次出现的地方，为了下面过滤
				maxlist.add(os);
			}else if(value == max){
				maxlist.add(os);
			}
		}
		
		//这个地方逻辑有点绕。找出 第一次最长字符串出现的位置，在这之前加入 maxlist中的数据都是假的
		int index =0;
		for (int i = 0; i < maxlist.size(); i++) {
			if(maxlist.get(i).equals(maxString)){
				index = i;
				break;
			}
		}
		
		System.out.println("max data");
		for (int i = index; i < maxlist.size(); i++) {
			System.out.println(maxlist.get(i));
		}
		System.out.println("max "+max);
	}
}
