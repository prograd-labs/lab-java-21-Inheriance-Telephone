package src.controller;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Uncomment the following lines
//import src.model.App;
//import src.model.TBasic; 
//import src.model.TCordless;
//import src.model.THandset;
//import src.model.TSmartphone;
//import src.model.Telephone;

/**
 * Servlet implementation class VehicleApplication
 */
@WebServlet(urlPatterns={"/TelephoneApplication"})
public class TelephoneApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TelephoneApplication() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Uncomment the following lines
		/*
		String value = request.getParameter("phone");

		Telephone telephone = null;
		int msgID = 0;
		String msg = "";
		
		String myNumber = "8015144219";
		int noOfKeys;
		
		switch(value) {
		case "basic":
			noOfKeys = 9;
			telephone = new TBasic(myNumber, noOfKeys);
			msg = myNumber + "<br>Keys: " + noOfKeys;
			msgID = 1;
			break;
		case "cordless":
			noOfKeys = 14;
			telephone = new TCordless(myNumber, noOfKeys, false, true);
			msg = myNumber + "<br>Keys: " + noOfKeys + "<br>Is wired? false<br>Has Display? true";
			msgID = 2;
			break;
		case "handset":
			noOfKeys = 14;
			telephone = new THandset(myNumber, noOfKeys, false, true);
			msg = myNumber + "<br>Keys: " + noOfKeys + "<br>Is wired? false<br>Has Display? true";
			msgID = 3;
			break;
		case "smartphone":
			noOfKeys = 3;
			App[] apps = new App[5];
			apps[0] = new App(0, "Alarm");
			apps[1] = new App(1, "Calculator");
			apps[2] = new App(2, "Calendar");
			apps[3] = new App(3, "Contacts");
			apps[4] = new App(4, "Message");
			telephone = new TSmartphone(myNumber, noOfKeys, false, true, apps);
			msg = myNumber + "<br>Keys: " + noOfKeys + "<br>Is wired? false<br>Has Display? true";
			msgID = 4;
			break;
		}
		
		Method[] methods = telephone.getClass().getDeclaredMethods();
		
		msg += "<br>";
		for (Method method : methods) {
				msg += method.getName() + "()<br>";
		}
		
		request.setAttribute("message" + msgID, msg);
		RequestDispatcher rd = this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp");
		rd.forward(request, response);
		*/
	}

}