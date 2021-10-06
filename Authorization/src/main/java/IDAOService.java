public interface IDAOService {
    void insertData(Login login);
    Login getData(String userId, String pass);
}
