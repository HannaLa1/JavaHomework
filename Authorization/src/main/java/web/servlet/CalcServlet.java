package web.servlet;

import entity.Operation;
import repository.DBConnection;
import repository.OperationDAO;
import service.CalcService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/calc")
public class CalcServlet extends HttpServlet {
    private static final String NUM1 = "num1";
    private static final String NUM2 = "num2";
    private static final String OPERATION = "submit";
    private final OperationDAO dao = new OperationDAO();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBConnection data = (DBConnection) getServletContext().getAttribute("DBConnection");
        int id = (int) req.getSession().getAttribute("userId");
        List<Operation> operationList = dao.getData(id, data);
        req.getSession().setAttribute("operationList", operationList);

        for (Operation op : operationList) {
            req.getSession().setAttribute("operationId", op.getOperationId());
        }

        getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DBConnection data = (DBConnection) getServletContext().getAttribute("DBConnection");
        double num1 = Double.parseDouble(req.getParameter(NUM1));
        double num2 = Double.parseDouble(req.getParameter(NUM2));
        String operation = req.getParameter(OPERATION);
        int id = (int) req.getSession().getAttribute("userId");

        double result = new CalcService().doOperation(num1, num2, operation);
        req.setAttribute("result", result);
        dao.insertData(new Operation(id, num1, num2, result, operation), data);

        List<Operation> operationList = dao.getData(id, data);
        req.getSession().setAttribute("operationList", operationList);

        getServletContext().getRequestDispatcher("/pages/calc.jsp").forward(req, resp);
    }
}
