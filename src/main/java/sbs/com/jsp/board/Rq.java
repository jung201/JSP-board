package sbs.com.jsp.board;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Rq {
    private final HttpServletRequest request; // 클라이언트가 보낸 요청 정보를 담고 있는 객체
    private final HttpServletResponse response; // 서버가 클라이언트에게 보낼 응답 정보를 담고 있는 객체

    public Rq(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;

        try {
            request.setCharacterEncoding("UTF-8"); // 들어오는 데이터를 UTF-8로 인식
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
        response.setCharacterEncoding("UTF-8"); // 완성된 HTML의 인코딩을 UTF-8로 하겠다
        response.setContentType("text/html; charset utf-8"); // 브라우저에게 우리가 만든 결과물이 UTF-8이다. 라고 알리는 의미
    }

    public int getIntParam(String paramName, int defaultValue) {
        String value = request.getParameter(paramName);

        if (value == null) {
            return defaultValue;
        }
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return defaultValue;
        }

    }

    public String getParam(String paramName, String defaultValue) {
        String value = request.getParameter(paramName);

        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    public void writer(String str) {
        try {
            response.getWriter().append(str);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
