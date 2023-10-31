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
                int price = sc.nextInt();
                sc.nextLine();

                System.out.print("중량 ) ");
                String gram = sc.nextLine();

                System.out.print("별점(5점 만점) ) ");
                int point = sc.nextInt();
                sc.nextLine();

                System.out.print("한 줄 평가 ) ");
                String content = sc.nextLine();

                Text text = new Text(number, foodName, brandName, price, gram, point, content);
                textList.add(text);

            }else if(command.equals("내가 쓴 게시글 보기")) {

                System.out.println("총" + textList.toArray().length + "개의 게시글이 있습니다.");
                for(int i = 0; i < textList.size(); i++) {
                    Text text = textList.get(i);
                    System.out.printf("%s, %s, %d, %s, %d, %s \n", text.getFoodName(), text.getBrandName(),
                            text.getPrice(), text.getGram(), text.getPoint(), text.getContent() );
                }

                System.out.println("1. 수정");
                System.out.println("2. 삭제 ");
                System.out.println("3. 메인");
                System.out.println("4. 로그아웃");
                System.out.println("5. 종료");
                String command1  = sc.nextLine();

                if(command1.equals("수정")) {
                    System.out.println("수정할 게시물 번호 ) ");
                    long modifyId = sc.nextLong();
                    sc.nextLine();
                    for(int i = 0; i < textList.size(); i++) {
                        Text text = textList.get(i);
                        if(modifyId == text.getNumber()) {
                            System.out.println("기존 ) "+ text.getNumber());
                            System.out.println("수정 ) ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            text.setNumber(number);

                            System.out.println("기존 ) "+ text.getNumber());
                            System.out.println("수정 ) ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            text.setNumber(number);

                            System.out.println("기존 ) "+ text.getNumber());
                            System.out.println("수정 ) ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            text.setNumber(number);

                            System.out.println("기존 ) "+ text.getNumber());
                            System.out.println("수정 ) ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            text.setNumber(number);

                            System.out.println("기존 ) "+ text.getNumber());
                            System.out.println("수정 ) ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            text.setNumber(number);

                            System.out.println("기존 ) "+ text.getNumber());
                            System.out.println("수정 ) ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            text.setNumber(number);

                            System.out.println("기존 ) "+ text.getNumber());
                            System.out.println("수정 ) ");
                            int number = sc.nextInt();
                            sc.nextLine();
                            text.setNumber(number);
                        }
                    }
                }
            }

        }
    }
}
