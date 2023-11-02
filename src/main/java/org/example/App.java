package org.example;


import org.example.text.Text;
import org.example.text.TextController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public void run() {
        Scanner sc = new Scanner(System.in);

        TextController textController = new TextController(sc);


        while(true) {

            System.out.println("게시글 작성");
            System.out.println("나의 게시글");
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

            System.out.print("명령어 ) ");
            String command = sc.nextLine();

            if(command.equals("게시글 작성")) {
                textController.create();
            }else if(command.equals("나의 게시글")) {
                textController.viewMyText();
            }

        }
    }
}

