package web.listener;

import repository.DBConnection;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionListener;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@WebListener
public class Listener implements HttpSessionListener,
        HttpSessionAttributeListener, ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();

        Properties properties = new Properties();
        InputStream in = sce.getServletContext().getResourceAsStream("/WEB-INF/db.properties");
        try {
            properties.load(in);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dbUrl = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");

        DBConnection connection = new DBConnection(dbUrl, user, password);
        context.setAttribute("DBConnection", connection);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();

        DBConnection connection = (DBConnection) context.getAttribute("DBConnection");
        connection.closeConnection();
    }
}
