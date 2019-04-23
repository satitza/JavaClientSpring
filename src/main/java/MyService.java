public class MyService implements IService {

    @ExcuteTime(printExcuteTime = false)
    public void openConnection() throws InterruptedException {

        System.out.println("Open connection ...");
        Thread.sleep(1000);

    }


    @ExcuteTime
    public void query() throws InterruptedException {


        System.out.println("Query data from database ...");
        Thread.sleep(3000);

    }

    @ExcuteTime
    public void insert() throws InterruptedException {

        System.out.println("Insert data into database ...");
        Thread.sleep(2000);

    }

    @ExcuteTime
    public void update() throws InterruptedException {

        System.out.println("Update data into database ...");
        Thread.sleep(3000);

    }

    @ExcuteTime
    public void delete() throws InterruptedException {

        System.out.println("Delete data from database ...");
        Thread.sleep(1000);

    }

    @ExcuteTime(printExcuteTime = false)
    public void closeConnection() throws InterruptedException {

        System.out.println("Close connection ....");
        Thread.sleep(1000);

    }
}
