package pl.matgor94.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@WebServlet("/servlet23")
public class Servlet23 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        Path path = Paths.get("C:\\Users\\User\\Desktop\\repleys_servlety\\oop.txt");
        List<String> linesFromFile = Files.readAllLines(path);
        for(String line : linesFromFile){
            response.getWriter().println(line);
        }
    }
}
