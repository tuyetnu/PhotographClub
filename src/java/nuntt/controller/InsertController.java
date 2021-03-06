/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuntt.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import nuntt.daos.RegistrationDAO;
import nuntt.dtos.RegistrationDTO;
import nuntt.dtos.RegistrationErrorDTO;



/**
 *
 * @author HaiNVSE62544
 */
public class InsertController extends HttpServlet {
    private static final String error = "error.jsp";
    private static final String success = "index.jsp";
    private static final String valiadation = "register.jsp";
    
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
            String username = request.getParameter("txtUsername");
            String password = request.getParameter("txtPassword");
            String confirm = request.getParameter("txtConfirm");
            String fullname = request.getParameter("txtFullname");
            String role = "user";
            RegistrationErrorDTO errorDTO = new RegistrationErrorDTO();
            boolean validate = false;
            if (username.length() == 0) {
                errorDTO.setUsernameError("Username can't be blank!");
                validate = true;
            }
            if (password.length() == 0) {
                errorDTO.setUsernameError("Password can't be blank!");
                validate = true;
            }
            if (!confirm.equals(password)) {
                errorDTO.setConfirmError("Confirm must match Password");
                validate = true;
            }
            if (fullname.length() == 0) {
                errorDTO.setUsernameError("Fullname can't be blank!");
                validate = true;
            }
            if (validate) {
                request.setAttribute("errorDTO", errorDTO);
                url = valiadation;
            } else {
                RegistrationDAO dao = new RegistrationDAO();
                RegistrationDTO dto = new RegistrationDTO(username, fullname, role);
                dto.setPassword(password);
                boolean check = dao.insert(dto);
                if (check) {
                    url = success;
                } else {
                    request.setAttribute("ERROR", "Insert failed!");
                }
            }
        } catch (Exception e) {
            if (e.getMessage().contains("duplicate")) {
                RegistrationErrorDTO errorDTO = new RegistrationErrorDTO();
                errorDTO.setUsernameError("Username is existed!");
                request.setAttribute("errorDTO", errorDTO);
                url = valiadation;
            }
            log("ERROR at InsertController: " + e.getMessage());
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
