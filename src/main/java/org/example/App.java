package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    List<Text> textList = new ArrayList<>();
    public void run() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("명령어 ) ");
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
                System.out.print("카테고리 )");
                int number = sc.nextInt();
                sc.nextLine();

                System.out.print("음식명 ) ");
                String foodName = sc.nextLine();

                System.out.print("브랜드명 ) ");
                String brandName = sc.nextLine();

                System.out.print("가격 ) ");
                String price = sc.nextLine();

                System.out.print("중량 ) ");
                String gram = sc.nextLine();

                System.out.print("별점(5점 만점) ) ");
                int point = sc.nextInt();
                sc.nextLine();

                System.out.print("한 줄 평가 ) ");
                String content = sc.nextLine();

                Text text = new Text(number, foodName, brandName, price, gram, point,content);
                textList.add(text);

            }

        }
    }
}
