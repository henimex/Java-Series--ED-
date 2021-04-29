package StaticUsage;

public class DataBaseHelper {
    public static class Crud {

        public static void Delete() {

        }

        public static void Update() {

        }
    }
    // ! Single Responsibility - Not Recommended
    public static class Connection {

        public static void createConnection(){

        }

        public static void checkConnection(){

        }
    }
}
