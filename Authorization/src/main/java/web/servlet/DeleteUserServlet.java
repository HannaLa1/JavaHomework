package web.servlet;

import repository.DBConnection;
import service.AuthorizationService;
import service.CalcService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deleteUser")
public class DeleteUserServlet extends HttpServlet {
    private final AuthorizationService storage = new AuthorizationService();
    private final CalcService calcService = new CalcService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        int id = Integer.parseInt(req.getParameter("id"));

        calcService.deleteByUserId(id, (DBConnection) req.getSession().getAttribute("DBConnection"));
        storage.deleteData(id, (DBConnection) req.getSession().getAttribute("DBConnection"));
        resp.sendRedirect("/admin");
    }
}
