public class EACN extends User{

    private String username;
    private int E;
    private int A;
    private int C;
    private int N;
    private int O;
    private String usertype;

    public EACN(String username, int e, int a, int c, int n, int o) {
        this.username = username;
        E = e;
        A = a;
        C = c;
        N = n;
        O = o;
        usertype = "EACN";
    }

    @Override
    public void addlogin(String username, String password) {
        login.put(username, password);
    }

    @Override
    public void createUser(String username, int e, int a, int c, int n, int o){
        EACN User = new EACN(username,e,a,c,n,o);
        Database.put("EACN",User);
    }

    @Override
    public String toString() {
        return "EACN{" +
                "username='" + username + '\'' +
                ", E=" + E +
                ", A=" + A +
                ", C=" + C +
                ", N=" + N +
                ", O=" + O +
                ", usertype='" + usertype + '\'' +
                '}';
    }

    //Only getters because none of these values can be altered, hence there is no use of setters
    public String getUsername() {
        return username;
    }

    public int getE() {
        return E;
    }

    public int getA() {
        return A;
    }

    public int getC() {
        return C;
    }

    public int getN() {
        return N;
    }

    public int getO() {
        return O;
    }

    public String getUsertype() {
        return usertype;
    }

}
