package sbs.com.jsp.board.container;

import sbs.com.jsp.board.article.ArticleController;
import sbs.com.jsp.board.MemberController.MemberController;

public class Container {
    public static MemberController memberController;
    public static ArticleController articleController;

    static {
        memberController = new MemberController();
        articleController = new ArticleController();

    }
}
