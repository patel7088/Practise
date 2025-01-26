package User;

import java.util.HashMap;

public class UserRepository {
    HashMap<Integer, User> db = new HashMap<>();
    public void initializeDatabase(){
        db.put(12,new User(12,"nanda","xxw@gmail"));
        db.put(13, new User(13,"sundeep","deib"));

    
    }
   public User findById(int user_id){
    User user = db.get(user_id);
        if(user != null){
            return user;
        }   
        else{
            return null;

        }      
     }
    

   }
     


    

