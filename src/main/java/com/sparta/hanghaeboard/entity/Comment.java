package com.sparta.hanghaeboard.entity;

import com.sparta.hanghaeboard.dto.CommentRequestDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Comment extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String content;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Board board;

    public Comment(User user, Board board, String content){
        this.user = user;
        this.board = board;
        this.content = content;
    }

    public  void update(CommentRequestDto requestDto){
        this.content = requestDto.getContent();
    }


}
