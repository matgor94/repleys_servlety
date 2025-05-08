package pl.matgor94.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/session4")
public class Session4 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
        HttpSession session = request.getSession();
        List<CartItem> cartItemList = (List<CartItem>) session.getAttribute("Lista zakupów");

        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().println("<h1>Zawartość koszyka:</h1>");
        if (cartItemList == null || cartItemList.isEmpty()) {
            response.getWriter().println("<p>Koszyk jest pusty.</p>");
        } else {
            for (CartItem item : cartItemList) {
                response.getWriter().println("<p>" + item.getName() + " - " + item.getQuantity() + " x "
                        + item.getPrice() + " = " + (item.getPrice() * item.getQuantity()) + " zł</p>");
            }
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException{
        String name = request.getParameter("nazwa");
        int quantity = Integer.parseInt(request.getParameter("ilosc"));
        int price = Integer.parseInt(request.getParameter("cena"));

        CartItem cartItem = new CartItem(name, quantity,price);

        HttpSession session = request.getSession();
        List<CartItem> cartItemList = (List<CartItem>) session.getAttribute("Lista zakupów");
        if(cartItemList == null){
            cartItemList = new ArrayList<>();
            session.setAttribute("Lista zakupów", cartItemList);
        }

        cartItemList.add(cartItem);
        session.setAttribute("Lista zakupów", cartItemList);

        response.sendRedirect("/session4");

    }
}
