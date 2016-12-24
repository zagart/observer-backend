package by.zagart.observer;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@SuppressWarnings("serial")
@WebServlet(name = "helloworld", value = "/")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest pRequest, HttpServletResponse pResponse) throws IOException {
        PrintWriter out = pResponse.getWriter();
        out.println("Hello, world");
    }
}
