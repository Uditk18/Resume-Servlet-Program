/**
 * Servlet implementation class ResumeServlet
 */

package co.cg.resume;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cg.model.ResumeModel;


@WebServlet("/ms1")
public class ResumeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ResumeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		// Getting each parameter from the index form (front page of resume prog)
		ResumeModel resume = new ResumeModel(request.getParameter("fName"), request.getParameter("lName"),
				request.getParameter("gender"), request.getParameter("highest"), request.getParameter("bday"),
				request.getParameterValues("hobbies"), request.getParameter("add"),
				request.getParameterValues("skills"), request.getParameter("emailadd"), request.getParameter("descrip"),
				request.getParameter("phone"));

		//Setting attribute
		request.setAttribute("ResumeObject", resume);
		//Forwarding the request to resume1.jsp page
		RequestDispatcher rd = request.getRequestDispatcher("resume1.jsp");
		rd.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
