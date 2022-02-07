package org.smart.board.controller;

import org.smart.board.entity.Guestbook;
import org.smart.board.service.GuestbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {

    @Autowired
    private GuestbookService guestbookService;
    /**
     * 방명록에 대한 요청
     * @return
     */
    @GetMapping("/guestbookList")
    public String guestbookList(Model model) {

        List<Guestbook> guestbookList = guestbookService.guestbookList();

        model.addAttribute("guestbookList", guestbookList);
        return "guestbook/guestbookList";
    }

    /**
     * 방명록 글을 등록하기 위한 화면 요청
     * @return
     */
    @GetMapping("/guestbookWrite")
    public String guestbookWrite(){
        return "guestbook/guestbookWrite";
    }


    @PostMapping("/guestbookWrite")
    public String guestbookWrite(Guestbook guestbook){
        guestbookService.guestbookWrite(guestbook);
        return "redirect:/guestbook/guestbookList";// guestbookList로 요청하도록함 (재요청) 컨트롤러에선 메소드끼리 호출이 안되기 때문
        // 브라우저에게 콘트롤러의 메소드를 재호출하도록 함
    }

    @GetMapping("/guestbookDelete")
    public String guestbookDelete(Long seq, String password){
        System.out.println(seq + ", " + password);

        Map<String, Object> map = new HashMap<>();
        map.put("seq", seq);
        map.put("password", password);
        //key는 다 문자열 value는 타입이 다 다르니 Object 사용

        //삭제하기
        guestbookService.guestbookDelete(map);


        return "redirect:/guestbook/guestbookList";
    }

}
