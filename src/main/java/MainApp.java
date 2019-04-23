public class MainApp {

    public static void main(String[] args) throws InterruptedException, InstantiationException, IllegalAccessException, ClassNotFoundException {

         //IService service = new MyService();
         //Object object = ServiceFactory.createService(service);

        Object object = ServiceFactory.createService(MyService.class);

        ((IService)object).openConnection();
        ((IService)object).query();
        ((IService)object).insert();
        ((IService)object).update();
        ((IService)object).delete();
        ((IService)object).closeConnection();

    }
}
