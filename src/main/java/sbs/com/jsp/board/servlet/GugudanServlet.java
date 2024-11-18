package sbs.com.jsp.board.servlet;

import jakarta.servlet.RequestDispatcher;
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

        request.setAttribute("dan", dan);
        request.setAttribute("limit", limit);
        
        // gbgbdan2.jsp에게 나머지 작업 토스
        // 왜냐하면 나중에 gugudan2.jsp에서 해당 내용을 꺼내 쓸 수 있다.
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/gugudan2.jsp");
        requestDispatcher.forward(request, response);


    }
}
