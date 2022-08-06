/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */


import Clases.ClienteModell;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;


@WebServlet(urlPatterns = {"/ClienteController"})
public class ClienteController extends HttpServlet {
ClienteModell clase;
public List<ClienteModell> clienteModell =  new ArrayList<ClienteModell>();;


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            out.println("<!DOCTYPE html>");
            out.println("<html><link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css\" integrity=\"sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N\" crossorigin=\"anonymous\">\n" +
            "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct\" crossorigin=\"anonymous\"></script>");
            out.println("<head>");
            out.println("<title>Servlet ClienteController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<div class=\"container\">");
            out.println("<br><nav class=\"navbar navbar-light bg-light\">\n" +
                        "            <form class=\"form-inline\">\n" +
                        "                <br><a href=\"index.html\">Retonar a la pagina principal</a>\n" +
                        "            </form>\n" +
                        "            </nav><br>");
            
         {
                
                String claseCodigo = request.getParameter("code");
                String claseNombre = request.getParameter("name");
                String claseDireccion = request.getParameter("address");
                String claseCorreo = request.getParameter("email");
                String claseTelefono = request.getParameter("phone");
                this.clienteModell.add(new ClienteModell(
                        claseCodigo,
                        claseNombre,
                        claseDireccion,
                        claseCorreo,
                        claseTelefono
                ));
         
            }

       
          
                String string="";
      for (int i = 0; i < this.clienteModell.size(); i++){
         string+="DATOS GUARDADOS\n";
      
         string+="Nombre: "+clase.nombre +"\n";
         
         string+="Direccion: "+clase.direccion+"\n";
         
         string+="Telefono: "+clase.telefono+"\n";

      }
      
   

            
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