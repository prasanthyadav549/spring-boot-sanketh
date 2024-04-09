package Lesson1_single_responsible_possible.Example4.betterCode;

public class UserManager {

    // UserRepository userRepo;
    public void createUser(String username) {
        // userRepo.create(username);
    }

    public void deleteUser(String username) {
        // userRepo.destroy()
    }

    /**
     * creation and deletion of a user is most probably effecting the same table of
       the common database.

     */
}
