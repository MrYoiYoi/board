package org.smart.board.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Guestbook {
    private Long seq;
    private String username;
    private String userpwd;
    private String text;
    private String regdate;
}


/*
    seq         NUMBER constraint guestbook_seq_pk PRIMARY KEY,
    username    VARCHAR2(50) constraint guestbook_name_nn NOT NULL,
    userpwd     VARCHAR2(50) constraint guestbook_pwd_nn NOT NULL,
    text        VARCHAR2(1000) default '안녕하세요?',
    regdate     DATE default sysdate
 */