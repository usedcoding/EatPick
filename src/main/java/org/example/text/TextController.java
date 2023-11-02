package org.example.text;

import org.example.myText.MyTextController;

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

    MyTextController myTextController = new MyTextController(sc);


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
            myTextController.modify();

        }else if(command1.equals("삭제")) {
                System.out.print("삭제할 게시물 번호 )");
                int removeId = sc.nextInt();

                for(int i = 0; i < textList.size(); i++) {
                    Text text = textList.get(i);
                    if(removeId == text.getId()) {
                            textList.remove(text);
                    }
                }

        } else if (command1.equals("메인")) {
                System.out.println("메인 화면으로 돌아갑니다.");

        }else if(command1.equals("로그아웃")){

        }else if(command1.equals("종료")) {
                System.out.println("종료합니다.");

        }

    }
}

