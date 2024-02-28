

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;

@WebFilter("/Login")
public class LoginFilter extends HttpFilter implements Filter {
       
	private static final long serialVersionUID = 1L;

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException 
	 {

		//get user parameters
	    String uname = request.getParameter("username");
	    String pass = request.getParameter("password");
	    boolean isValid = isValidated(uname,pass);
	    
	    if(isValid) {
			chain.doFilter(request, response);  
			return;
	    }else {
	    	request.setAttribute("error", "Please fill the form correctly");
            request.getRequestDispatcher("/login.jsp").forward(request, response);
            return;
	    }
	    	
	}

	   
	   	private boolean isValidated(String uname, String pass) 
	   	{
	   		if ((uname.length() >=  5 && uname != null) && (pass.isEmpty() != true && pass != null)) {
	   			return true;
	   		}
	   		return false;
		}



  
}
