import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final String USERID_PARAM = "userId";
    private static final String PASSWORD_PARAM = "password1";
    private static final String SUBMIT = "submit";

    public LoginServlet() {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IDAOService data = new DAOService();

        String userId = request.getParameter(USERID_PARAM);
        String password = request.getParameter(PASSWORD_PARAM);
        String submitType = request.getParameter(SUBMIT);

        Login login = data.getData(userId, password);

        if (submitType.equals("logIn") && login != null && login.getUserName() != null) {
            request.setAttribute("message", login.getUserName());
            request.getRequestDispatcher("successAuthorization.jsp").forward(request, response);
        } else if (submitType.equals("registration")) {
            request.getRequestDispatcher("registration.jsp").forward(request, response);
        } else {
            request.setAttribute("message", "Exist Registered user, please Registration..!!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }

    }
}
