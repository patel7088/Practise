import java.util.ArrayList;
import java.util.List;
public class userManager{
    private List<User> users ;

    public userManager(){
        this.users = new ArrayList<>();
    }
    public void addUser(User user){
        users.add(user);
    }
    public  User findUserByName(String user_name){
        for(int i=0;i<users.size();i++){
            User user=users.get(i);
            if (user.getUser_name()==user_name){
                return user;
            }
        }
        return null;
        }
    }


    

