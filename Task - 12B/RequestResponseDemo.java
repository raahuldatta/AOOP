import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RequestResponseDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<h3>Your name is: " + name + "</h3>");
        out.println("<h3>Your age is: " + age + "</h3>");
    }
}