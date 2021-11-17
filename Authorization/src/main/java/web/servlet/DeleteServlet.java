package web.servlet;

import repository.DBConnection;
import service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    private final CalcService storage = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = (int) req.getSession().getAttribute("operationId");

        storage.deleteData(id, (DBConnection) req.getSession().getAttribute("DBConnection"));
        resp.sendRedirect("/calc");
    }
}
