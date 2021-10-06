import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
    private static final String USERID_PARAM = "userId";
    private static final String PASSWORD_PARAM = "password1";
    private static final String SUBMIT = "submit";

    public RegistrationServlet() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IDAOService data = new DAOService();

        String userId = request.getParameter(USERID_PARAM);
        String password = request.getParameter(PASSWORD_PARAM);
        String submitType = request.getParameter(SUBMIT);

        Login login = data.getData(userId, password);

        if (submitType.equals("registr")) {
            login.setUserId(userId);
            login.setPassword(password);
            login.setUserName(request.getParameter("userName"));

            data.insertData(login);

            request.setAttribute("successMessage", "Registration done successfully, now you can LogIn..");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
