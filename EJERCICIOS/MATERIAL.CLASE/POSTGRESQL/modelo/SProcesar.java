package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SProcesar extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (request.getParameter("registrar") != null) {
            ConexionPostgresql cp = new ConexionPostgresql();
            cp.setConexion(true);
            Connection conexion = cp.getConexion();
            OperacionesCrud crud = new OperacionesCrud(conexion);

            String idAficionado = request.getParameter("txtIdAficionado");
            String nombre = request.getParameter("txtNombre");
            String[] clubs = request.getParameterValues("chkClub");

            Aficionado aficionado = new Aficionado(Integer.parseInt(idAficionado), nombre, clubs);

            String mensaje = "";

            if (conexion != null) {
                if (crud.insertarRegistroAficionadoTablaAficionado(aficionado)) {
                    mensaje = "OK: INSERTAR REGISTRO";
                } else {
                    mensaje = "ERROR: INSERTAR REGISTRO";
                }
            } else {
                mensaje = "ERROR: CONEXION BASE DE DATOS";
            }

            request.setAttribute("mensaje_p", mensaje);
            request.setAttribute("control_p", "OK");

            RequestDispatcher rd = request.getRequestDispatcher("registrar.jsp");
            rd.include(request, response);
        }

        if (request.getParameter("action") != null) {
            ConexionPostgresql cp = new ConexionPostgresql();
            cp.setConexion(true);
            Connection conexion = cp.getConexion();
            OperacionesCrud crud = new OperacionesCrud(conexion);

            String mensaje = "";

            List<Aficionado> aficionados_al = null;

            if (conexion != null) {
                if ((aficionados_al = crud.obtenerListaAficionadosFromTablaAficionado()) != null) {
                    mensaje = "OK: OBTENER REGISTROS";
                } else {
                    mensaje = "ERROR: OBTENER REGISTROS";
                }
            } else {
                mensaje = "ERROR: CONEXION BASE DE DATOS";
            }

            request.setAttribute("aficionados_al_p", aficionados_al);
            request.setAttribute("mensaje_p", mensaje);
            request.setAttribute("control_p", "OK");

            RequestDispatcher rd = request.getRequestDispatcher("mostrar.jsp");
            rd.include(request, response);
        }

        if (request.getParameter("resetear") != null) {
            ConexionPostgresql cp = new ConexionPostgresql();
            cp.setConexion(true);
            Connection conexion = cp.getConexion();
            OperacionesCrud crud = new OperacionesCrud(conexion);

            String mensaje = "";

            if (conexion != null) {
                if (crud.eliminarTablaAficionadoSiExiste() && crud.crearTablaAficionado()) {
                    mensaje = "OK: BORRAR Y CREAR TABLA";
                } else {
                    mensaje = "ERROR: BORRAR Y CREAR TABLA";
                }
            } else {
                mensaje = "ERROR: CONEXION BASE DE DATOS";
            }

            request.setAttribute("mensaje_p", mensaje);
            request.setAttribute("control_p", "OK");

            RequestDispatcher rd = request.getRequestDispatcher("resetear.jsp");
            rd.include(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
