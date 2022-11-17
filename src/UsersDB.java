import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UsersDB {


   private final Map<String, Users> users = new HashMap<>();

   public static String key = "";

    public UsersDB() {
        this.users.put("admin", new Users("admin", "admin", Users.Role.ADMIN));
        this.users.put("user1", new Users("user1", "user1", Users.Role.USER));


    }


    public Map<String, Users> getUsers() {
        return users;
    }

    public static void listUsers(Map<String, Users> users){
        Set<Map.Entry<String, Users>> pary = users.entrySet();
        for(Map.Entry<String, Users> para : pary) {
            System.out.println("Klucz: " + para.getKey() + " wartosc: " + para.getValue());
        }
    }

    public Users findUserByLogin(String name){
        return this.users.get(name);
    }

    public void addUsers(Users users){
        this.users.put(key, users );
    }


}
