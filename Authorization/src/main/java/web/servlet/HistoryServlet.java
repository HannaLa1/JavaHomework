package web.servlet;

import entity.Operation;
import repository.DBConnection;
import service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/history")
public class HistoryServlet extends HttpServlet {
    private final CalcService storage = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        List<Operation> operationList = storage.getData(id, (DBConnection) req.getSession().getAttribute("DBConnection"));
        req.getSession().setAttribute("operations", operationList);

        getServletContext().getRequestDispatcher("/pages/history.jsp").forward(req, resp);
    }
}
