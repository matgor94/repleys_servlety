package pl.matgor94.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/get3")
public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String height = request.getParameter("height");
        String width = request.getParameter("width");

        if (height != null && width != null &&
                Integer.parseInt(height) > 0 && Integer.parseInt(width) > 0) {
            for (int i = 1; i <= Integer.parseInt(width); i++) {
                for (int y = 1; y <= Integer.parseInt(height); y++) {
                    response.getWriter().println(i + " x " + y + " = " + (i * y));
                }
            }
        } else {
            for (int i = 1; i <= 5; i++) {
                for (int y = 1; y <= 10; y++) {
                    response.getWriter().println(i + " x " + y + " = " + (i * y));
                }
            }
        }

    }
}
