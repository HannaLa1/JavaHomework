package web.servlet;

import entity.User;
import repository.DBConnection;
import service.AuthorizationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/admin")
public class AdminServlet extends HttpServlet {
    private final AuthorizationService storage = new AuthorizationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = storage.getAllUsers((DBConnection) req.getSession().getAttribute("DBConnection"));
        req.getSession().setAttribute("userList", userList);

        getServletContext().getRequestDispatcher("/pages/admin.jsp").forward(req, resp);
    }
}