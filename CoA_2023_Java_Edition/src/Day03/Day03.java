package Day03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day03 {
	private int solution1 = 0;
	private int solution2 = 0;
	static Scanner in;


	public static void main(String[] args) {
		Day03 day03 = new Day03();
		Day03.solution(day03);
		System.out.println("Solution 1: " + day03.getSolution1());
		System.out.println("Solution 2: " + day03.getSolution2());
	}

	private static void solution(Day03 day03) {
		StringBuilder sb = new StringBuilder();
		try {
			in = new Scanner(new FileReader("./src/Day03/Day03.txt"));
			while (in.hasNext()) {
				sb = new StringBuilder().append(in.nextLine());
				day03.setSolution1(day03.getSolution1() + method1(sb.toString()));
				day03.setSolution2(day03.getSolution2() + method2(sb.toString()));
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not Found");
		}
	}

	private static int method1(String string) {
	
			return 0;
	}

	private static int method2(String string) {
		return 0;
	}

	public int getSolution1() {
		return solution1;
	}

	public void setSolution1(int solution1) {
		this.solution1 = solution1;
	}

	public int getSolution2() {
		return solution2;
	}

	public void setSolution2(int solution2) {
		this.solution2 = solution2;
	}

}
