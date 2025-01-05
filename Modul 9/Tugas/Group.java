import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {

    // Method to get users sorted by the most recently registered
    public List<User> getUsersSortedByMostRecentlyRegistered() {
        List<User> users = new ArrayList<>();

        // Check if the user directory exists
        if (!userDirectoryExists()) {
            return users;
        }

        // Add found users to the list
        addFoundUsersTo(users);

        // Sort users by most recently registered
        sortByMostRecentlyRegistered(users);

        return users;
    }

    private boolean userDirectoryExists() {
        return new File(persistencePath()).exists();
    }

    private void addFoundUsersTo(List<User> users) {
        File[] files = new File(persistencePath()).listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    users.add(new User(file.getName(), this));
                }
            }
        }
    }

    private void sortByMostRecentlyRegistered(List<User> users) {
        Collections.sort(users, new User.UserComparatorByDescendingRegistration());
    }

    private String persistencePath() {
        // Return the directory path where user data is stored
        return "path/to/user/directory"; // Replace with actual directory path
    }
}