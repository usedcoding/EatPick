package org.example.myText;

import org.example.text.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyTextController {
    Scanner sc;

    List<Text> textList = new ArrayList<>();
    public MyTextController(Scanner sc) {
        this.sc = sc;
    }
    public void modify() {
        System.out.println("수정할 게시물 번호 ) ");
        long modifyId = sc.nextLong();
        sc.nextLine();
        for (int i = 0; i < textList.size(); i++) {
            Text text = textList.get(i);
            if (modifyId == text.getId()) {

                System.out.println("기존 카테고리 명 ) " + text.getNumber());
                System.out.print("수정 ) ");
                int number = sc.nextInt();
                sc.nextLine();
                text.setNumber(number);

                System.out.println("기존 음식명 ) " + text.getFoodName());
                System.out.print("수정 ) ");
                String foodName = sc.nextLine();
                text.setFoodName(foodName);

                System.out.println("기존 브랜드 명 ) " + text.getBrandName());
                System.out.print("수정 ) ");
                String brandName = sc.nextLine();
                text.setBrandName(brandName);

                System.out.println("기존 가격 ) " + text.getPrice());
                System.out.print("수정 ) ");
                int price = sc.nextInt();
                sc.nextLine();
                text.setPrice(price);

                System.out.println("기존 중량 ) " + text.getGram());
                System.out.print("수정 ) ");
                String gram = sc.nextLine();
                text.setGram(gram);

                System.out.println("기존 별점 ) " + text.getPoint());
                System.out.print("수정 ) ");
                int point = sc.nextInt();
                sc.nextLine();
                text.setPoint(point);

                System.out.println("기존 한 줄 평가 ) " + text.getContent());
                System.out.print("수정 ) ");
                String content = sc.nextLine();
                text.setContent(content);

            }
        }
    }
}
