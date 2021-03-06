package Models;

import java.util.List;
import java.util.UUID;

public class Employee {
    private String Id;
    private String name;
    private String username;
    private String password;

    public Employee(String name, String username, String password){
        this.name = name;
        this.username = username;
        this.Id = UUID.randomUUID().toString();
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }
}
