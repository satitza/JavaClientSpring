public interface IService {

    void openConnection() throws InterruptedException;

    void query() throws InstantiationException, InterruptedException;

    void insert() throws InterruptedException;

    void update() throws InterruptedException;

    void delete() throws InterruptedException;

    void closeConnection() throws InterruptedException;

}
