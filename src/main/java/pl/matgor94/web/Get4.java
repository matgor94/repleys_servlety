package pl.matgor94.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

@WebServlet("/get4")
public class Get4 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Map<String, String[]> parametersMap = request.getParameterMap();
        Set<String> keys = parametersMap.keySet();

        for(String key : keys){
            response.getWriter().println(key + " :");

            String [] tabOfValues = parametersMap.get(key);
            for (int i = 0; i < tabOfValues.length; i++){
                response.getWriter().println("- " + tabOfValues[i]);
            }
        }
    }

}
