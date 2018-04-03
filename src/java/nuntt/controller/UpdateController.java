/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuntt.controller;

import nuntt.daos.RegistrationDAO;
import nuntt.dtos.RegistrationDTO;
import nuntt.dtos.RegistrationErrorDTO;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author HaiNVSE62544
 */
public class UpdateController extends HttpServlet {

    private static final String error = "error.jsp";
    private static final String update = "update.jsp";

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
        response.setContentType("text/html;charset=UTF-8");
        String url = error;
        try {
            String action = request.getParameter("action");
            String lastSearchValue = request.getParameter("txtSearch");
            RegistrationDAO dao = new RegistrationDAO();
            if (action.equals("Edit")) {
                String username = request.getParameter("txtUsername");
                RegistrationDTO dto = dao.findByPK(username);
                request.setAttribute("INFO", dto);
                url = update;
            } else if (action.equals("Update")) {
                String username = request.getParameter("txtUsername");
                String fullname = request.getParameter("txtFullname");
                String role = request.getParameter("rdRole");
                RegistrationErrorDTO errorObj = new RegistrationErrorDTO();
                if (fullname.isEmpty()) {
                    errorObj.setFullnameError("Fullname can't be blank");
                    url = update;
                    request.setAttribute("errorObj", errorObj);
                }
                else {
                    boolean check = dao.update(new RegistrationDTO(username, fullname, role));
                    if (check) {
                        url = "SearchController?txtSearch=" + lastSearchValue;
                    }
                    else {
                        request.setAttribute("ERROR", "Update failed");
                    }
                }
            } else {
                request.setAttribute("ERROR", "Action is not support!");
            }
        } catch (Exception e) {
            log("ERROR at UpdateController: " + e.getMessage());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
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
