/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import DatasourceSmallSteps.DataAccessObject;
import DatasourceSmallSteps.DataAccessObjectImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ejer
 */
@WebServlet(name = "SmallStepsServlet", urlPatterns = {"/SmallStepsServlet"})
public class SmallStepsServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            
            DataAccessObjectImpl dao = new DataAccessObjectImpl();
            response.setContentType("text/html;charset=UTF-8");
            int id = Integer.parseInt(request.getParameter("step_id"));

            try (PrintWriter out = response.getWriter()) {
               

                String stepname = dao.getSteps().get(id).getName();
                int stepid = dao.getSteps().get(id-1).getId();
//                
             
                
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet SmallStepsServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet SmallStepsServlet at:</h1>");
//                out.println("<h3> Have to see if it responds Step_Id:  "+dao.getSteps().get(1).getId()+".</h3>");
                out.println("<h3> Have to see if it responds stepname:  "+stepid+"  . "+stepname+"</h3>");
                out.println("</body>");
                out.println("</html>");
            }
        }   catch (Exception ex) {
            Logger.getLogger(SmallStepsServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
