package Day04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day04 {
	private int solution1 = 0;
	private int solution2 = 0;
	static Scanner in;


	public static void main(String[] args) {
		Day04 day04 = new Day04();
		Day04.solution(day04);
		System.out.println("Solution 1: " + day04.getSolution1());
		System.out.println("Solution 2: " + day04.getSolution2());
	}

	private static void solution(Day04 day04) {
		StringBuilder sb = new StringBuilder();
		try {
			in = new Scanner(new FileReader("./src/Day02/Day02.txt"));
			while (in.hasNext()) {
				sb = new StringBuilder().append(in.nextLine());
				day04.setSolution1(day04.getSolution1() + checkSingleCard1(sb.toString()));
				day04.setSolution2(day04.getSolution2() + checkSingleCard2(sb.toString()));
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not Found");
		} finally {
			in.close();
		}
	}

	private static int checkSingleCard1(String string) {
			return 0;
	}

	private static int checkSingleCard2(String string) {
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
