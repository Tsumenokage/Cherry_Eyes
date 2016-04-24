package com.cherry.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import synesketch.emotion.EmotionalState;
import synesketch.emotion.Empathyscope;

/**
 * Servlet implementation class Primitive
 */
@WebServlet("/Primitive")
public class Primitive extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Primitive() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String commande;
		String ip = request.getParameter("adresse");
		String port = request.getParameter("port");
		String primitive = request.getParameter("primitive");
		String color = request.getParameter("color");
		String mood = request.getParameter("mood");
		
		if(color.isEmpty() || mood.isEmpty())
		{
			commande = "http://" + ip + ":" + port + "/" + primitive;
			System.out.println(commande);
			if(ip != null && port != null && primitive != null)
			{
				URL url = null;
				try
				{
					url = new URL(commande);
				}
				catch(MalformedURLException e)
				{
					System.err.println(e.getMessage());	
				}
							
				try 
				{
					BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream(), "UTF-8"));
				    for (String line; (line = reader.readLine()) != null;) {
				        System.out.println(line);
				    }
				}
				catch(IOException ioe)
				{
					System.err.println(ioe.getMessage());
				}
			}
		}
		else
		{
			playSpeakPrimitive(color,mood,ip,port);
		}
		this.getServletContext().getRequestDispatcher( "/Index.jsp" ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public static void playSpeakPrimitive(String colorString, String moodString, String ip, String port){
		
			String primitive = "eyes_behave";
			String propertyColor = "colorEye";
			String propertyMood = "moodEye";
    	
			String strColor = "\"" + colorString + "\"";
			String strMood = "\"" + moodString + "\"";
			String url = "http://" + ip + ":" + port;
			// Start Primitive
    		
    		//System.out.println("\nText to speak :" + txtString);
			try {
				HttpURLConnectionExample.sendPost(url + "/primitive/" + primitive + "/property/" + propertyColor +"/value.json", strColor);
				HttpURLConnectionExample.sendPost(url + "/primitive/" + primitive + "/property/" + propertyMood +"/value.json", strMood);
				HttpURLConnectionExample.sendGet(url + "/primitive/" + primitive + "/start.json");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}

}
