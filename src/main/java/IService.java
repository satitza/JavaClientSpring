public interface IService {

    public void openConnection() throws InterruptedException;

    public void query() throws InstantiationException, InterruptedException;

    public void insert() throws InterruptedException;

    public void update() throws InterruptedException;

    public void delete() throws InterruptedException;

    public void closeConnection() throws InterruptedException;

}
