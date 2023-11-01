package org.example.text;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Text {
    private long id;
    private int number;
    private String foodName;
    private String brandName;
    private int price;
    private String gram;
    private int point;
    private String content;
}
