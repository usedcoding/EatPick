package org.example;

import java.util.Scanner;

public class App {
    public void run() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String command = sc.nextLine();
            System.out.println("게시글 작성");
            System.out.println("내가 쓴 게시글 보기");
            System.out.println("전체 게시글 보기");
            System.out.println("카테고리 검색\n" +
                    "- 탄수화물\n" +
                    "- 육류\n" +
                    "- 어류\n" +
                    "- 식물성\n" +
                    "- 영양제\n" +
                    "- 보충제\n" +
                    "- 기타");
            System.out.println("음식 검색");
            System.out.println("브랜드 검색");
            System.out.println("로그아웃");
            System.out.println("종료");

            if(command.equals("게시글 작성")) {
                System.out.print("카테고리 번호를 입력해 주세요.");
                int number = sc.nextInt();
                sc.nextLine();

                System.out.println("음식명 ) ");
                String foodName = sc.nextLine();

                System.out.println("브랜드명 ) ");
                String brandName = sc.nextLine();

                System.out.println("가격 ) ");
                String price = sc.nextLine();

                System.out.println("중량 ) ");
                String gram = sc.nextLine();

                System.out.println("별점(5점 만점) ) ");
                int point = sc.nextInt();
                sc.nextLine();

                System.out.println("한 줄 평가 ) ");
                String content = sc.nextLine();


            }
        }
    }
}
