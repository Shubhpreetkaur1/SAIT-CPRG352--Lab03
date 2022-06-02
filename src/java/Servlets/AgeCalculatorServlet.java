
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
       return; // stop the code call! important!
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String age = request.getParameter("age");
        
        if(age == null || age.equals("")){
            String message = "You must give your current age";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
            return;
        }
        else{
            try{
                int ageVariable = Integer.parseInt(request.getParameter("age"));
                ageVariable++;
                String message = "Your age next birthday will be " + ageVariable;
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }
            catch(NumberFormatException e){
                String message = "You must enter a number";
                request.setAttribute("message", message);
                getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp").forward(request, response);
                return;
            }
            
                
        }
    }
}
