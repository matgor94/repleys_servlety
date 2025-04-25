package pl.matgor94.form;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/post2")
public class Form2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<String> wulgaryzmy = new ArrayList<>();
        wulgaryzmy.add("cholera");
        wulgaryzmy.add("kurwa");
        wulgaryzmy.add("chuj");
        wulgaryzmy.add("debil");

        String choice = request.getParameter("choice");
        String text = request.getParameter("text");

        if(choice.equalsIgnoreCase("tak")){
            response.getWriter().println(text);
        } else {
            String [] cuttedStr = text.split(" ");
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i<cuttedStr.length; i++){
                if(wulgaryzmy.contains(cuttedStr[i].toLowerCase())){
                    String tmp = "";
                    for (int j = 1; j <=cuttedStr.length; j++){
                        tmp = tmp + "*";
                    }
                    stringBuilder.append(tmp).append(" ");
                }else {
                    stringBuilder.append(cuttedStr[i]).append(" ");
                }
            }
            response.getWriter().println(stringBuilder.toString());
        }
    }
}
