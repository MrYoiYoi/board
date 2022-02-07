package org.smart.board.service;

import org.smart.board.dao.GuestbookDao;
import org.smart.board.entity.Guestbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class GuestbookServiceImpl implements GuestbookService{
    @Autowired
    private GuestbookDao guestbookDao;


    @Override
    public List<Guestbook> guestbookList() {
        List<Guestbook> guestbookList = guestbookDao.findAll();
        System.out.println("=========== 목록 : "+guestbookList);
        return guestbookList;
    }

    @Override
    public int insert(Guestbook guestbook) {
        int result = guestbookDao.insert(guestbook);
        return result;
    }

    @Override
    public int guestbookDelete(Map<String, Object> map) {
        return guestbookDao.delete(map);
    }

    @Override
    public int guestbookWrite(Guestbook guestbook) {
        int result = guestbookDao.insert(guestbook);
        return result;
    }
}
