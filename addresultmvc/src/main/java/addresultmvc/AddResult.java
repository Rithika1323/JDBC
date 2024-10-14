package addresultmvc;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.qn.model.Student;


public class AddResult extends HttpServlet {
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id =Integer.parseInt(req.getParameter("id"));
		String name =req.getParameter("name");
		int mark1 =Integer.parseInt(req.getParameter("mark1"));
		int mark2 =Integer.parseInt(req.getParameter("mark2"));
		int mark3 =Integer.parseInt(req.getParameter("mark3"));
		
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setMarks1(mark1);
		st.setMarks2(mark2);
		st.setMarks3(mark3);
		
		int r = st.addResult();
		if(r==1) {
			resp.sendRedirect("/addresultmvc/addresultsucess.html");
		}
		else {
			resp.sendRedirect("/addresultmvc/addresultfailure.html");
		}
	}
		
}
