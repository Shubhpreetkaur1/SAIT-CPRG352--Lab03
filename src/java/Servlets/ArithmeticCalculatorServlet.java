
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
       return; // stop the code call! important!
       
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String first = request.getParameter("first");
       String second = request.getParameter("second");
        
       request.setAttribute("first", first);
       request.setAttribute("second", second);
        if(first == null || first.equals("") || second == null || second.equals("")){
            String message = " Result : invalid";
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            return;
        }
        else
        {
            try{
                int firstNumber=Integer.parseInt(first);
                int secondNumber=Integer.parseInt(second);
                
                int answer=0;
                if(request.getParameter("cal").equals("+"))
  {
  answer= firstNumber+secondNumber;
  }
                else if(request.getParameter("cal").equals("-"))
  {
   answer= firstNumber-secondNumber; 
  }
  else if(request.getParameter("cal").equals("*"))
  {
    answer= firstNumber*secondNumber; 
  }
  else if(request.getParameter("cal").equals("%"))
  {
   answer= firstNumber%secondNumber;
  }
                
                
                String message = "Result : " + answer;
                request.setAttribute("message",message);
                request.setAttribute("first", first);
                request.setAttribute("second", second);
               getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
           return;
            }
           catch (NumberFormatException e){
                  
                  String message="Result: invalid";
           
           // set the rror message
           request.setAttribute("message", message);
           request.setAttribute("first", first);
           request.setAttribute("second", second);
         
           getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
           return;
           
           }
        }
    }
}
    
    


