package developerapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pidor")
public class PidorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JspServlet servlet = new JspServlet();

        req.setAttribute("name", servlet.division(59, 892.21));
        req.getRequestDispatcher("pidor-page.html").forward(req, resp);
    }
}
