package model;


public class Client {
    private int id;
    private String first_name;
    private String last_name;
    private String email;
    private String phone_number;

    private String password;

    public Client() {
    }

    public Client(int id, String first_name, String last_name, String email, String phone_number, String password) {
        super();
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phone_number = phone_number;
        this.password = password;
    }


    public int isId() {
        return id;
    }


    public String isFirst_name() {
        return first_name;
    }

    public String isLast_name() {
        return last_name;
    }

    public String getEmail() {
        return email;
    }

    public String isPhone_number() {
        return phone_number;
    }

    public void setId(int clientId) {
        this.id = clientId;
    }

    public void setFirst_name(String firstName) {
        this.first_name = firstName;
    }

    public void setLast_name(String lastName) {
        this.last_name = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone_number(String phoneNumber) {
        this.phone_number = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + id +
                ", firstName='" + first_name + '\'' +
                ", lastName='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phone_number + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
