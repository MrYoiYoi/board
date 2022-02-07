package org.smart.board.service;

import org.smart.board.entity.Guestbook;

import java.util.List;
import java.util.Map;

public interface GuestbookService {
    // 목록요청
    public List<Guestbook> guestbookList();
    // 글쓰기
    public int insert(Guestbook guestbook);
    // 글삭제제
    public int guestbookDelete(Map<String, Object> map);

    public int guestbookWrite(Guestbook guestbook);
}
