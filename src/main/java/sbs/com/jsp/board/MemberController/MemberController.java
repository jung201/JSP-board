package sbs.com.jsp.board.MemberController;

import sbs.com.jsp.board.Rq;

public class MemberController {

    public void showjoin(Rq rq) {
        rq.appendBody("회원가입");
    }
}
