package pl.matgor94.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addToSession")
public class Session3Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().println("<form action='/addToSession' method='POST'>\n" +
                "    <label>\n" +
                "        Klucz:\n" +
                "        <input type='text' name='key'>\n" +
                "    </label>\n" +
                "    <label>\n" +
                "        Wartość:\n" +
                "        <input type='text' name='value'>\n" +
                "    </label>\n" +
                "    <input type='submit'>\n" +
                "</form>\n");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");

        HttpSession session = request.getSession();
        String key = request.getParameter("key");
        String value = request.getParameter("value");
        session.setAttribute(key, value);

        List<String> listOfKeys = (List<String>) session.getAttribute("sessionKeys");
        if(listOfKeys == null){
            listOfKeys = new ArrayList<>();
        }
        listOfKeys.add(key);
        session.setAttribute("sessionKeys", listOfKeys);
        response.sendRedirect("/showAllSessions");
    }
}
