public class User {
    private String name;
    private Group group;

    public User(String name, Group group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public Group getGroup() {
        return group;
    }

    // Comparator to sort users by descending registration
    public static class UserComparatorByDescendingRegistration implements java.util.Comparator<User> {
        @Override
        public int compare(User u1, User u2) {
            // Add logic to compare users by registration time
            // For demonstration purposes, this compares alphabetically
            return u2.getName().compareTo(u1.getName());
        }
    }
}
