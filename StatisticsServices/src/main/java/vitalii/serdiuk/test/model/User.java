package vitalii.serdiuk.test.model;

import lombok.Getter;
import lombok.ToString;

import java.sql.Date;

@ToString
public class User {

    @Getter
    private String firstName;

    @Getter
    private String lastName;

    @Getter
    private String email;

    @Getter
    private Date birthday;

    public User() {

    }

    public User(UserDtoBuilder userDtoBuilder) {
        this.firstName = userDtoBuilder.firstName;
        this.lastName = userDtoBuilder.lastName;
        this.email = userDtoBuilder.email;
        this.birthday = userDtoBuilder.birthday;
    }

    public static class UserDtoBuilder {

        private String firstName;
        private String lastName;
        private String email;
        private Date birthday;

        public UserDtoBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserDtoBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserDtoBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserDtoBuilder setBirthday(Date birthday) {
            this.birthday = birthday;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
