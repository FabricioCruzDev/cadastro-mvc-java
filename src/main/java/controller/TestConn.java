package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdbc.ConnectionDb;


@WebServlet(name = "TestConn", urlPatterns = {"/TestConn"})

public class TestConn extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                request.setCharacterEncoding("UTF-8");
                response.setContentType("text/html; charset=UTF-8");
                try {
                    Connection conn = ConnectionDb.getConnection();
                    System.out.println("Conexão criada com sucesso");
                } catch (SQLException exc ){
                    System.err.println("Erro ao tentar criar a conexão!");
                    exc.printStackTrace();
                }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                request.setCharacterEncoding("UTF-8");
                response.setContentType("text/html; charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
                processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{
                request.setCharacterEncoding("UTF-8");
                response.setContentType("text/html; charset=UTF-8");
                response.setCharacterEncoding("UTF-8");
                processRequest(request, response);
    }

    @Override
    public String getServletInfo(){
        return "Testa a connexão com o banco de dados";
    } 
}
