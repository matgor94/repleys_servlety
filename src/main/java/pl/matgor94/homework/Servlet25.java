package pl.matgor94.homework;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@WebServlet("/servlet25")
public class Servlet25 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Random random = new Random();
        List<Integer> integerList = new ArrayList<>();
        for(int i = 1; i <=10; i++){
            integerList.add(random.nextInt(101)+1);
        }

        response.getWriter().println("Lista wylosowana: " + integerList +"\n");
        Collections.sort(integerList);
        response.getWriter().println("Lista posortowana: " + integerList +"\n");

    }

}
