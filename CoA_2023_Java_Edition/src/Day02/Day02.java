package Day02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Day02 {
	private int solution1 = 0;
	private int solution2 = 0;
	static Scanner in;

	final static int blue = 14;
	final static int red = 12;
	final static int green = 13;

	public static void main(String[] args) {
		Day02 day02 = new Day02();
		Day02.solution(day02);
		System.out.println("Solution 1: " + day02.getSolution1());
	}

	private static void solution(Day02 day02) {
		StringBuilder sb = new StringBuilder();
		try {
			in = new Scanner(new FileReader("./src/Day02/Day02.txt"));
			while (in.hasNext()) {
				sb = new StringBuilder().append(in.nextLine());
				day02.setSolution1(day02.getSolution1() + checkSingleGame(sb.toString()));
			}
		} catch (FileNotFoundException e) {
			System.err.println("File not Found");
		}
	}

	private static int checkSingleGame(String string) {
		int game = Integer.parseInt((string.split("Game ")[1].split(":")[0]));
		string = string.split(":")[1].replace(",", "");

		boolean checkCondition = true;

		String[] showDices = string.split(";");
		for (String string2 : showDices) {
			string2 = string2.trim();
			String[] check = string2.split(" ");
			for (int i = 0; i < check.length; i++) {
				if (!check[i].matches("\\d+")) {
					int value = Integer.parseInt(check[i - 1]);
					switch (check[i]) {
					case "blue":
						if (value > blue) {
							checkCondition = false;
						}
						break;
					case "red":
						if (value > red) {
							checkCondition = false;
						}
						break;
					case "green":
						if (value > green) {
							checkCondition = false;
						}
						break;
					}
				}
			}
		}
		
		if(checkCondition) { return game; } else { return 0; }
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
