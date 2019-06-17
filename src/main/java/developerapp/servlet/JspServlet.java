package developerapp.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/jsp")
public class JspServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("name", division(59, 892.21));
        req.getRequestDispatcher("math.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }

    public double division (int a, int b) {
        double result = (double)a/(double)b;
        return result;
    }

    public double division (double a, int b) {
        double result = a/(double)b;
        return result;
    }

    public double division (int a, double b) {
        double result = a/(double)b;
        return result;
    }

    public double division (double a, double b) {
        double result = a/b;
        return result;
    }

}
