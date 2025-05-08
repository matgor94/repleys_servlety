package pl.matgor94.session;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet("/session5")
public class Session5 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Random random = new Random();
        int first = random.nextInt(101);
        int second = random.nextInt(101);
        int captcha = first + second;

        HttpSession session = request.getSession();
        session.setAttribute("captcha", captcha);

        request.setAttribute("first", first);
        request.setAttribute("second", second);

        RequestDispatcher dispatcher = request.getRequestDispatcher("session5.jsp");
        dispatcher.forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session =request.getSession();
        int captchaFromSession = (int) session.getAttribute("captcha");

        int captchFromForm = Integer.parseInt(request.getParameter("captcha"));

        if(captchaFromSession == captchFromForm){
            response.getWriter().println(request.getParameter("imie") + " " + request.getParameter("nazwisko") + " poprawnie zalogował się do serwisu");
        }else {
            response.getWriter().println("Użytkownik podał błędną wartość captcha");
        }

    }
}
