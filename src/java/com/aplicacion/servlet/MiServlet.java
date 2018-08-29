/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aplicacion.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import Caracteristicas.*;
import Fabricas.*;

/**
 *
 * @author Daniel
 */
@WebServlet(name = "ServletOperaciones", urlPatterns = {"/ServletOperaciones"})
public class MiServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MiServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MiServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Catálogo de personajes</title>");            
            out.println("</head>");
            out.println("<body>");
            
            FabricaAbstracta fabrica;
            Cuerpo cuerpo;
            Arma arma;
            Escudo escudo;
            Montura montura;
            
            String btnHumano = request.getParameter("btnHumano");
            String btnElfo = request.getParameter("btnElfo");
            String btnEnano = request.getParameter("btnEnano");
            String btnOrco = request.getParameter("btnOrco");
            String btnTrol = request.getParameter("btnTrol");
            
            if(btnHumano!=null){
                
                fabrica = new FabricaHumanos();
                cuerpo = fabrica.crearCuerpo(); 
                arma = fabrica.crearArma();
                escudo = fabrica.crearEscudo();
                montura = fabrica.crearMontura();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+cuerpo.crearCuerpo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("<td><img src='"+arma.crearArma()+"' width=\"450\" height=\"450\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><img src='"+montura.crearMontura()+"' width=\"450\" height=\"450\"/></td>");
                out.println("<td><img src='"+escudo.crearEscudo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("</tr>");
                out.println("</table>");
                
                
            }
            
            if(btnElfo!=null){
                
                fabrica = new FabricaElfos();
                cuerpo = fabrica.crearCuerpo(); 
                arma = fabrica.crearArma();
                escudo = fabrica.crearEscudo();
                montura = fabrica.crearMontura();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+cuerpo.crearCuerpo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("<td><img src='"+arma.crearArma()+"' width=\"450\" height=\"450\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><img src='"+montura.crearMontura()+"' width=\"450\" height=\"450\"/></td>");
                out.println("<td><img src='"+escudo.crearEscudo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("</tr>");
                out.println("</table>");
                
            }
            
            if(btnEnano!=null){
                
                fabrica = new FabricaEnanos();
                cuerpo = fabrica.crearCuerpo(); 
                arma = fabrica.crearArma();
                escudo = fabrica.crearEscudo();
                montura = fabrica.crearMontura();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+cuerpo.crearCuerpo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("<td><img src='"+arma.crearArma()+"' width=\"450\" height=\"450\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><img src='"+montura.crearMontura()+"' width=\"450\" height=\"450\"/></td>");
                out.println("<td><img src='"+escudo.crearEscudo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("</tr>");
                out.println("</table>");
                
            }
            
            if(btnOrco!=null){
                
                fabrica = new FabricaOrcos();
                cuerpo = fabrica.crearCuerpo(); 
                arma = fabrica.crearArma();
                escudo = fabrica.crearEscudo();
                montura = fabrica.crearMontura();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+cuerpo.crearCuerpo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("<td><img src='"+arma.crearArma()+"' width=\"450\" height=\"450\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><img src='"+montura.crearMontura()+"' width=\"450\" height=\"450\"/></td>");
                out.println("<td><img src='"+escudo.crearEscudo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("</tr>");
                out.println("</table>");
                
            }
            
            if(btnTrol!=null){
                
                fabrica = new FabricaTrols();
                cuerpo = fabrica.crearCuerpo(); 
                arma = fabrica.crearArma();
                escudo = fabrica.crearEscudo();
                montura = fabrica.crearMontura();
                out.println("<table>");
                out.println("<tr>");
                out.println("<td><img src='"+cuerpo.crearCuerpo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("<td><img src='"+arma.crearArma()+"' width=\"450\" height=\"450\"/></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td><img src='"+montura.crearMontura()+"' width=\"450\" height=\"450\"/></td>");
                out.println("<td><img src='"+escudo.crearEscudo()+"' width=\"450\" height=\"450\"/></td>");  
                out.println("</tr>");
                out.println("</table>");
                
            }
            
            out.println("</body>");
            out.println("</html>");
        }
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
