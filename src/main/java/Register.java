

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
		   String fname = request.getParameter("fname").trim();
		   String lname = request.getParameter("lname").trim();
		   String uname = request.getParameter("uname").trim();
		   String email = request.getParameter("email").trim();
		   String pass = request.getParameter("pass").trim();
		   String cpass = request.getParameter("cpass").trim();
		   
		   //set request parameters for the user 
		   request.setAttribute("fname", fname);
		   request.setAttribute("lname", lname);  
		   request.setAttribute("uname", uname); 
		   request.setAttribute("email", email);  
		   request.setAttribute("pass", request.getParameter("pass"));  
		   request.setAttribute("cpass", request.getParameter("cpass"));  
		   
		   //check if userame length is not lesser than 5 characters
		   if(uname.length() < 5) {
			   request.setAttribute("error", "Please make sure that username field is up to five characters");
			   request.getRequestDispatcher("/register.jsp").forward(request,response);
		   }
		   
		   
		   //check if password data is the same
		   if(pass != cpass) {
			   request.setAttribute("error", "Password Mismatch");
			   request.getRequestDispatcher("/register.jsp").forward(request,response);
		   }
		   
		   
		
	
	}

//	private String excapeHtml(String userInput) {
//		
//		return StringEscapeUtils.escapeHtml4(userInput);
//		 
//	}
	
}
