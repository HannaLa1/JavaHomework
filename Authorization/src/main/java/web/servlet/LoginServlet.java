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

        User user = storage.getData(log, password, (DBConnection) req.getSession().getAttribute("DBConnection"));

        if (submitType.equals("logIn") && user != null && user.getUserName() != null) {
            req.getSession().setAttribute("user", user);
            req.getSession().setAttribute("userId", user.getId());
            req.getSession().setAttribute("message", user.getUserName());

            if(user.getRole().equals("ADMIN")){
                resp.sendRedirect("/admin");
            }else if(user.getRole().equals("USER")){
                resp.sendRedirect("/calc");
            }
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
