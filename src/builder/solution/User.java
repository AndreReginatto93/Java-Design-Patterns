package builder.solution;

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

    public static class UserBuilder {
        private String uid;
        private String name;
        private LocalDate birthDate;

        public UserBuilder uid(String uid){
            this.uid = uid;
            return this;
        }
        public UserBuilder name(String name){
            this.name = name;
            return this;
        }
        public UserBuilder birthDate(LocalDate birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public User build(){
            return new User(uid, name, birthDate);
        }
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
