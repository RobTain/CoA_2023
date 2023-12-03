package Day03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
		LinkedList<String> input = new LinkedList<String>();
		try {
			in = new Scanner(new FileReader("./src/Day03/Day03.txt"));
		
			while (in.hasNext()) {
				input.add(new StringBuilder().append(in.nextLine()).toString());
				}
			
			day03.setSolution1(day03.getSolution1() + checkInput1(input));
			day03.setSolution2(day03.getSolution2() + checkInput2(input));
		} catch (FileNotFoundException e) {
			System.err.println("File not Found");
		} finally {
			in.close();
		}
	}

	private static int checkInput1(LinkedList<String> input) {
	
			return 0;
	}

	private static int checkInput2(LinkedList<String> input) {
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
