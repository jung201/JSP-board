package sbs.com.jsp.board.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import sbs.com.jsp.board.Rq;

import java.io.IOException;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Rq rq = new Rq(request, response);

        int dan = rq.getIntParam("dan", 9);
        int limit = rq.getIntParam("limit", 9);

        rq.writer("<h1>%d단</h1>".formatted(dan));

        for (int i = 1; i <= limit; i++) {
            rq.writer(("<div>%d * %d = %d</div>".formatted(dan, i, dan * i)));
        }

    }
}
