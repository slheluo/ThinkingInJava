package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @Author sl
 * @Date 2017年12月23日 下午1:03:27
 * @Version 1.0
 * 
 */
public class Main {

	public static void main(String[] args) {
		Scanner sc;
		try {
			sc = new Scanner(new File("C:\\Users\\sl\\Desktop\\老王\\tongji.txt"));
			while (sc.hasNextLine()) {
				System.out.println("****************************************************");
				String str = sc.nextLine();
				HashMap<Character, Integer> chartnums = new HashMap<>();
				for (int i = 0; i < str.length(); i++) {
					char c = str.charAt(i);
					if (chartnums.get(c) != null) {
						chartnums.put(c, chartnums.get(c) + 1);
					} else {
						chartnums.put(c, 1);
					}
				}
				for (int i = 0; i < 10; i++) {
					char c = (char) (i + '0');
					System.out.println(c + ": " + chartnums.get(c));
				}
				System.out.println("*: " + chartnums.get('*'));
				System.out.println("+: " + chartnums.get('+'));
				System.out.println("总计：" + str.length());
				System.out.println("****************************************************");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
