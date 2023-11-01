package org.example;

import org.example.myText.Mytext;
import org.example.text.Text;
import org.example.text.TextController;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public void run() {
        Scanner sc = new Scanner(System.in);

        TextController textController = new TextController(sc);

        Mytext mytext = new Mytext();

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
                textController.create();


            }else if(command.equals("내가 쓴 게시글 보기")) {
                textController.viewMyText();


                }else if(command1.equals("삭제")) {
                    mytext.removeMyText();
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
                    return;
                }else if(command1.equals("로그아웃")){

                }else if(command1.equals("종료")) {
                    System.out.println("종료합니다.");
                    break;
                }
            }

        }
    }
}
