package web.servlet;

import entity.User;
import repository.DBConnection;
import service.AuthorizationService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.Random;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    private static final String LOG_PARAM = "login";
    private static final String PASSWORD_PARAM1 = "password1";
    private static final String PASSWORD_PARAM2 = "password2";
    private static final String SUBMIT = "submit";
    private final AuthorizationService storage = new AuthorizationService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String log = req.getParameter(LOG_PARAM);
        String password1 = req.getParameter(PASSWORD_PARAM1);
        String password2 = req.getParameter(PASSWORD_PARAM2);
        String submitType = req.getParameter(SUBMIT);

        User user = storage.getData(log, password1, (DBConnection) req.getSession().getAttribute("DBConnection"));

        if (password1.equals(password2)){
            if (submitType.equals("registr")) {
                user.setLogin(log);
                user.setPassword(password1);
                user.setUserName(req.getParameter("userName"));
                user.setRole(String.valueOf(User.Role.values()[new Random().nextInt(User.Role.values().length)]));

                storage.insertData(user, (DBConnection) req.getSession().getAttribute("DBConnection"));

                req.setAttribute("successMessage", "Registration done successfully, now you can LogIn..");
                getServletContext().getRequestDispatcher("/pages/login.jsp").forward(req, resp);
            }
        }else {
            req.setAttribute("mess", "Confirm the password again...");
            getServletContext().getRequestDispatcher("/pages/registration.jsp").forward(req, resp);
        }
    }
}
