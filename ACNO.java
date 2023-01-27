public class ACNO extends User{
    private String username;
    private String password;
    private int E;
    private int A;
    private int C;
    private int N;
    private int O;
    private String usertype;

    public ACNO(String username, int e, int a, int c, int n, int o) {
        this.username = username;
        E = e;
        A = a;
        C = c;
        N = n;
        O = o;
        usertype = "ACNO";
    }

    @Override
    public void addlogin(String username, String password) {
        login.put(username, password);
    }

    @Override
    public void createUser(String username, int e, int a, int c, int n, int o){
        ACNO User = new ACNO(username,e,a,c,n,o);
        Database.put("ACNO",User);
    }

    @Override
    public String toString() {
        return "ACNO{" +
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

    public void setUsername(String username) {
        this.username = username;
    }
}
