package org.example.myText;

import org.example.text.Text;
import org.example.text.TextController;

import java.util.Scanner;

public class Mytext {
    Scanner sc;
    TextController textController = new TextController(sc);
    public void removeMyText() {
        System.out.print("삭제할 게시물 번호 )");
        int removeId = sc.nextInt();

        for(int i = 0; i < textList.size(); i++) {
            Text text = textList.get(i);
            if(removeId == text.getId()) {
                textList.remove(text);
            }
        }
    }
}
