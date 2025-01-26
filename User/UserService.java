package User;
//import User.UserRepository;


public class UserService {
    public UserRepository userRepository;
    public UserService(){
        this.userRepository=new UserRepository();
        //UserRepository userRepository = new UserRepository();
        this.userRepository.initializeDatabase();
    }
    public User getUserById(int user_Id){
       //UserRepository userRepository = new UserRepository();
       //userRepository.initializeDatabase();
       
        
    User User_details = userRepository.findById(user_Id);
     System.out.println(User_details+"------------------------------------");
        try {
            if(userRepository != null){
                
                return User_details;
            } {
                throw new Exception( "Error when fetching user_id " +user_Id);
            }
        }
            catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
                return null; 
            }
        
            
            
       
        
        
        }

    }

    

