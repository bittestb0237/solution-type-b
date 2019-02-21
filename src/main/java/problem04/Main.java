package problem04;

import java.util.Scanner;

public class Main {
	
	static char[] path = new char[20];
	static int restart = 0; 
	static int count = 0; 
	
	public static void main(String[] args) {
		river();
		makepath();
		
		int user = 0;
		
		System.out.println("아무키나 눌러주세요");
		
		Scanner input = new Scanner(System.in);
		String n = input.nextLine();
		while(user != path.length) {
			int d = journey(user);
			if(n.isEmpty()) {
				if (path[user + d - 1]=='#') {
					//restart game
					river();
					System.out.println("다리 만들기");
					makepath();
					restart ++;
					user = 0;

					System.out.println("엔터키 눌러주세요");
					n = input.nextLine();
				} else {
					user += d;
					count++;
					System.out.println("엔터키 누르세요!");
					n = input.nextLine();
				}
			}
		}
		
		System.out.println("게임끝");

		
	}

	
	public static void river() {
		int water = 0; 
		int stone = 0;
		for (int i = 0; i<path.length; i++) {
			int r = (int)(Math.random()*2)+1;
			//1 : water(#) 2 : stone(O)
			if (r ==1 && water != 10) {
				path[i] = '#';
				water++;
			} else if (r == 2 && stone != 10) {
				path[i] = 'O';
				stone++;
			} else {
				i--;
			}
		}
	}
	
	public static void makepath() {
		for (char c : path) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	public static int journey(int position) {
		int result = (int)(Math.random()*4)+1;
		System.out.println("현재 : "+ result);
		position += result;
		makepath();
		for (int i = 0; i<position-1; i++) {
			System.out.print(" ");
		}
		System.out.println("^");
		return result;
	}
}