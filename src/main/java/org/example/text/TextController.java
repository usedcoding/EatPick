package org.example.text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextController {
    List<Text> textList = new ArrayList<>();
    Scanner sc;
    long id = 0;

    public TextController(Scanner sc) {
        this.sc = sc;
    }
    public void create() {
        id++;
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

        Text text = new Text(id, number, foodName, brandName, price, gram, point, content);
        textList.add(text);

        System.out.println(id + "번 게시물이 등록 되었습니다.");
    }

    public void viewMyText() {
        System.out.println("총" + textList.toArray().length + "개의 게시글이 있습니다.");
        for(int i = 0; i < textList.size(); i++) {
            Text text = textList.get(i);
            System.out.printf("%d, %d, %s, %s, %d, %s, %d, %s \n",text.getId() ,text.getNumber(), text.getFoodName(), text.getBrandName(),
                    text.getPrice(), text.getGram(), text.getPoint(), text.getContent() );
        }

        System.out.println("1. 수정");
        System.out.println("2. 삭제 ");
        System.out.println("3. 메인");
        System.out.println("4. 로그아웃");
        System.out.println("5. 종료");
        System.out.print("명령어 ) ");
        String command1  = sc.nextLine();

        if(command1.equals("수정")) {
            System.out.println("수정할 게시물 번호 ) ");
            long modifyId = sc.nextLong();
            sc.nextLine();
            for(int i = 0; i < textList.size(); i++) {
                Text text = textList.get(i);
                if(modifyId == text.getId()) {

                    System.out.println("기존 카테고리 명 ) "+ text.getNumber());
                    System.out.print("수정 ) ");
                    int number = sc.nextInt();
                    sc.nextLine();
                    text.setNumber(number);

                    System.out.println("기존 음식명 ) "+ text.getFoodName());
                    System.out.print("수정 ) ");
                    String foodName = sc.nextLine();
                    text.setFoodName(foodName);

                    System.out.println("기존 브랜드 명 ) "+ text.getBrandName());
                    System.out.print("수정 ) ");
                    String brandName = sc.nextLine();
                    text.setBrandName(brandName);

                    System.out.println("기존 가격 ) "+ text.getPrice());
                    System.out.print("수정 ) ");
                    int price = sc.nextInt();
                    sc.nextLine();
                    text.setPrice(price);

                    System.out.println("기존 중량 ) "+ text.getGram());
                    System.out.print("수정 ) ");
                    String gram = sc.nextLine();
                    text.setGram(gram);

                    System.out.println("기존 별점 ) "+ text.getPoint());
                    System.out.print("수정 ) ");
                    int point = sc.nextInt();
                    sc.nextLine();
                    text.setPoint(point);

                    System.out.println("기존 한 줄 평가 ) "+ text.getContent());
                    System.out.print("수정 ) ");
                    String content = sc.nextLine();
                    text.setContent(content);
                }
            }
    }
}
