package pl.matgor94.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/servlet242")
public class Servlet242 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String products[] = {
                "Asus Transformer;2999.99",
                "iPhone 6';3499.18",
                "Converse Sneakers;125.00",
                "LG OLED55B6P OLED TV;6493.91",
                "Samsung HT-J4100;800.99",
                "Alpine Swiss Dress Belt;99.08",
                "60 Watt LED;1.50",
                "Arduino Nano;3.26",
        };

        if(id != null && Integer.parseInt(id) >=0 && Integer.parseInt(id) <= 7){
            String product = products[Integer.parseInt(id)].replace(";", " - ");
            response.getWriter().println(product);

        }else {
            response.getWriter().println("Product not found");
        }
    }

}
