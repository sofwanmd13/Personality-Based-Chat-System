import java.util.HashMap;

public abstract class User {

    public static HashMap<String, Object> Database = new HashMap<String, Object>();

    public static HashMap<String, String> login = new HashMap<String, String>();

    public static HashMap<String, Integer> portNum = new HashMap<String, Integer>();

    public void setPort(String username, int port){
        portNum.put(username, port);
    }

    public void createUser(String username, int e, int a, int c, int n, int o){};

    public abstract void addlogin(String username, String password);

    public  User() {
    }

}

