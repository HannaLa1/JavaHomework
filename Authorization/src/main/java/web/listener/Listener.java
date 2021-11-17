package web.listener;

import repository.DBConnection;

import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import java.io.IOException;
import java.util.Properties;

@WebListener
public class Listener implements HttpSessionListener,
        HttpSessionAttributeListener, ServletContextListener {

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        Properties properties = new Properties();

        try {
            properties.load(DBConnection.class.getClassLoader().getResourceAsStream("db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String dbUrl = properties.getProperty("jdbc.url");
        String user = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");

        DBConnection connection = new DBConnection(dbUrl, user, password);
        se.getSession().setAttribute("DBConnection", connection);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        DBConnection connection = (DBConnection) se.getSession().getAttribute("DBConnection");
        connection.closeConnection();
    }
}
