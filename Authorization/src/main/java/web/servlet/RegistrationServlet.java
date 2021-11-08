package web.servlet;

import entity.User;
import repository.DBConnection;
import service.AuthorizationService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private static final String LOG_PARAM = "login";
    private static final String PASSWORD_PARAM = "password1";
    private static final String SUBMIT = "submit";
    private final AuthorizationService storage = new AuthorizationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String log = req.getParameter(LOG_PARAM);
        String password = req.getParameter(PASSWORD_PARAM);
        String submitType = req.getParameter(SUBMIT);

        DBConnection data = (DBConnection) getServletContext().getAttribute("DBConnection");
        User user = storage.getData(log, password, data);

        if (submitType.equals("registr")) {
            user.setLogin(log);
            user.setPassword(password);
            user.setUserName(req.getParameter("userName"));

            storage.insertData(user, data);

            req.setAttribute("successMessage", "Registration done successfully, now you can LogIn..");
            getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
        }
    }
}
