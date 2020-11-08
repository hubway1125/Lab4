package pk1;
// rebirth

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloGet")
public class HelloGet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8"); // UTF-8編碼
		res.setContentType("text/plain; charset=Big5");
//        res.setContentType("UTF-8");
		PrintWriter out = res.getWriter();

		String[] values = req.getParameterValues("checkbox");
		if (values != null) {
			for (int i = 0; i < values.length; i++) {
				out.println("checkbox" + "[" + i + "]:" + values[i]);
			}
		} else {
			out.println("Error! Nothing is selected!");
		}

//		Enumeration<String> enum_params = req.getParameterNames();		
//		while(enum_params.hasMoreElements()) {
//			String name = (String)enum_params.nextElement();
//			String values[] = req.getParameterValues(name);
//			if(values != null) {
//				for(int i = 0; i < values.length; i++) {
//					out.println(name+"["+i+"]:"+values[i]);
//				}
//			}
//		}					
	}
}
