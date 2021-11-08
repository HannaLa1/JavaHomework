package web.servlet;

import entity.Operation;
import repository.DBConnection;
import repository.OperationDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private final OperationDAO dao = new OperationDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBConnection data = (DBConnection) getServletContext().getAttribute("DBConnection");
        int operationId = (int) req.getSession().getAttribute("operationId");

        dao.deleteData(operationId, data);
        resp.sendRedirect("/calc");
    }
}
