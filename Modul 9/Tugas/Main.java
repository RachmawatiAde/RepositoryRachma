import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group = new Group();

        // Get users sorted by most recently registered
        List<User> sortedUsers = group.getUsersSortedByMostRecentlyRegistered();

        // Print the sorted users
        for (User user : sortedUsers) {
            System.out.println("User: " + user.getName());
        }
    }
}
