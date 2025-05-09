package pl.matgor94.mvc;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/mvc14")
public class Mvc14 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("W pustyni i w puszczy", "Henryk Sienkiewicz", 125485360));
        bookList.add(new Book("Algorytmy", "Aditya Y. Bhargava",55555555));
        bookList.add(new Book("Pan Tadeusz", "Adam Mickiewicz", 452523663));

        request.setAttribute("bookList", bookList);
        getServletContext().getRequestDispatcher("/resultList.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
