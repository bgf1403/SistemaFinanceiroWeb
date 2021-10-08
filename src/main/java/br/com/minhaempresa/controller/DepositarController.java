package br.com.minhaempresa.controller;

import br.com.minhaempresa.domain.Conta;
import br.com.minhaempresa.service.DepositarService;
import net.bytebuddy.asm.Advice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Currency;


@WebServlet(urlPatterns = "/depositar")
public class DepositarController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String sobrenome = req.getParameter("sobrenome");
        double valor = Double.parseDouble(req.getParameter("valor"));

        try {
            DepositarService depositarService = new DepositarService();


//            resp.getWriter().println("Cliente: " + conta.getTitular().getNome() + " " + conta.getTitular().getSobrenome());
            resp.getWriter().println("Valor depositado: " + NumberFormat.getCurrencyInstance().format(valor));

        } catch(NumberFormatException e){
            resp.getWriter().println("Somente valor positivo!");
        }



    }
}
