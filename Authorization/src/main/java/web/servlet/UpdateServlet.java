package web.servlet;

import repository.DBConnection;
import service.AuthorizationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {
    private final AuthorizationService storage = new AuthorizationService();
    private static final String PASSWORD_PARAM = "password";
    private static final String SUBMIT = "submit";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/pages/update.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter(PASSWORD_PARAM);
        String submitType = req.getParameter(SUBMIT);
        int id = Integer.parseInt(req.getParameter("id"));

        if (submitType.equals("Submit")){
            storage.update(id, password, (DBConnection) req.getSession().getAttribute("DBConnection"));
        }
        resp.sendRedirect("/admin");
    }
}
