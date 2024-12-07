/*class kelasPengguna {
    protected String n; //username
    protected String p; //password
    public void penyimpanan(String n, String p) {
        // isi code
}
}*/

public class kelasPengguna {
    private String username; // Menyimpan username
    private String password; // Menyimpan password

    // Constructor untuk inisiasi
    public kelasPengguna(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Getter untuk username
    public String getUsername() {
        return username;
    }

    // Setter untuk username
    public void setUsername(String username) {
        this.username = username;
    }

    // Getter untuk password
    public String getPassword() {
        return password;
    }

    // Setter untuk password
    public void setPassword(String password) {
        this.password = password;
    }

    // Metode untuk menyimpan data user
    public void saveUserData() {
        // Implementasi penyimpanan data pengguna
        System.out.println("User data saved: " + username);
    }
}
