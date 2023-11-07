import javax.xml.crypto.Data;

public class DataBase {
    private String name;

    public DataBase(String name) {
        this.name = name;
    }
    private static DataBase instance;
    public static DataBase getInstance(String name){
        if (null == instance){
            instance = new DataBase(name);
            return instance;
        }else{
            return instance;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
