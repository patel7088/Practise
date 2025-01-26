package User;

import java.util.ArrayList;
import java.util.List;

public class User {
        private int user_id;
        private String user_name;
        private String user_email;
         private List<User> users ;
        
      

    
        public User(int user_id,String user_name,String user_email){
            this.user_id = user_id;
            this.user_name = user_name;
            this.user_email = user_email;
        }
        public  int  getUser_id(){
            return user_id;
        }
        public String getUser_name(){
            return user_name;
        }
        public String getUser_email(){
            return user_email;

        }
        public int setUser_id(){
            return user_id;
        }
        public String setUser_name(){
            return user_name;
        }
        public String setUser_email(){
            return user_email;
        }
        public void userDetails(){
            this.users = new ArrayList<>();
        }
        public void addDetails(User user){
            users.add(user);
        }
        public User returnDetails(String user_name){
            for (int i=0;i<users.size();i++){
                User user=users.get(i);
                if (user.getUser_name() == user_name){
                    return user;

                }
            }
            return null;


        }
}
