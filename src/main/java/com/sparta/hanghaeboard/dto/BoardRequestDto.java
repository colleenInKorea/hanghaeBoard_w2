package com.sparta.hanghaeboard.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
//@AllArgsConstructor
public class BoardRequestDto {
    private  String title;
    private String content;

//    public BoardRequestDto(String title, String content){
//        this.title = title;
//        this.content = content;
//    }
}

