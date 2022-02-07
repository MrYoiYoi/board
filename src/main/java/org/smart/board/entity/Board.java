package org.smart.board.entity;

import lombok.*;

@Data // 밑에 5개 다 만들어주는거라 5개 밑에 다 쓰면 없어도 됨
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Board {
    private Long boardseq;
    private String usrid;
    private String title;
    private String content;
    private int hitcount;
    private String regdate;
    private String originalfile;
    private String savefile;
}

/*
CREATE TABLE board
(
    boardseq NUMBER constraint board_seq_pk PRIMARY KEY,        --게시글 일련번호
    usrid    varchar2(20) constraint board_id_nn NOT NULL,      --작성자 아이디
    title    varchar2(200) constraint title_id_nn NOT NULL,     --게시글 제목
    content  varchar2(4000) constraint content_id_nn NOT NULL,  --게시글 내용
    hitcount NUMBER default 0,                                  --게시글 조회수
    regdate  DATE DEFAULT SYSDATE,                              --등록일
    originalfile varchar2(500), --파일의 이름 (원래 이름)
    savefile varchar2(500)      --첨부파일명 (실제 저장된 파일명)

);
 */