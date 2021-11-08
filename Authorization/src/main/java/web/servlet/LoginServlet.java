package web.servlet;

import entity.Operation;
import entity.User;
import repository.DBConnection;
import repository.OperationDAO;
import service.AuthorizationService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private static final String LOG_PARAM = "login";
    private static final String PASSWORD_PARAM = "password1";
    private static final String SUBMIT = "submit";
    private final AuthorizationService storage = new AuthorizationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String log = req.getParameter(LOG_PARAM);
        String password = req.getParameter(PASSWORD_PARAM);
        String submitType = req.getParameter(SUBMIT);

        DBConnection data = (DBConnection) getServletContext().getAttribute("DBConnection");
        User user = storage.getData(log, password, data);

        if (submitType.equals("logIn") && user != null && user.getUserName() != null) {
            req.getSession().setAttribute("user", user);
            req.getSession().setAttribute("userId", user.getUserId());
            req.getSession().setAttribute("message", user.getUserName());
            resp.sendRedirect("/calc");
            return;
        } else if (submitType.equals("registration")) {
            getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
        } else {
            req.setAttribute("message", "Exist Registered user, please Registration..!!");
            getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
        }
        getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
    }
}
