package builder.problem;

import java.time.LocalDate;

public class User {
    private String uid;
    private String name;
    private LocalDate birthDate;

    public User(String uid, String name, LocalDate birthDate) {
        this.uid = uid;
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
