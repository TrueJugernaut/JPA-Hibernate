package developerapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<h1>Hello world, server have started</h1>" +
                "</br>" +
                "<button><a href=\"https://shielded-journey-87346.herokuapp.com/jsp\">go to jsp template page</a></button>" +
                "<button><a href=\"https://shielded-journey-87346.herokuapp.com/pidor\">go to jsp template page</a></button>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
