import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VoterEligibilityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int age = Integer.parseInt(request.getParameter("age"));
        String name = request.getParameter("name");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (age >= 18) {
            out.println("<h3>Hello " + name + ", you are eligible to vote!</h3>");
        } else {
            out.println("<h3>Hello " + name + ", you are not eligible to vote yet.</h3>");
        }
    }
}