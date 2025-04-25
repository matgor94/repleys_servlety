package pl.matgor94.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/session1Get")
public class Session1Get extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("counter") != null) {
            int valueOfSession = (int) session.getAttribute("counter");
            session.setAttribute("counter", valueOfSession + 1);
        } else response.getWriter().println("EMPTY");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
