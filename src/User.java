public class User {
    private String email;
    private String password;
    private String name;

    public User(String name, String email) {
        this(name, email, null);
    }

    // 생성자 오버로딩
    public User(String name, String email, String password) {
        this.email = email;
        this.password = password;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

