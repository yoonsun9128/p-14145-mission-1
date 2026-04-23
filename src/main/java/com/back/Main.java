package com.back;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 명언 앱 ==");

		Scanner sc = new Scanner(System.in);

		int count = 1;

		ArrayList<Auther> authers = new ArrayList<>();

		while (true) {
			System.out.print("명령) ");
			String input = sc.nextLine();
			if (input.equals("등록")) {
				System.out.print("명언) ");
				String input_line = sc.nextLine();
				System.out.print("작가) ");
				String input_auther = sc.nextLine();
				System.out.println(count + "번 명언이 등록되었습니다.");
				Auther newOne = new Auther(count, input_auther, input_line);
				authers.add(newOne);
				count++;
				continue;
			} else if (input.equals("목록")) {
				System.out.println("번호 / 작가 / 명언");
				System.out.println("----------------------");
				for (int i = authers.size() - 1; i >= 0; i--) {
					Auther auther = authers.get(i);
					System.out.println(auther.num + " / " + auther.user + " / " + auther.comment);
				}
				continue;
			} else if (input.equals("종료")) {
				break;
			}
		}
		//1단계 - 8단계 구현!
	}
}