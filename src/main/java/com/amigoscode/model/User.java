package com.amigoscode.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String name;
    private String email;
    private Integer age;

    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.email = userBuilder.email;
        this.age = userBuilder.age;
    }

    public static class UserBuilder {
        private Long id;
        private String name;
        private String email;
        private Integer age;

        public UserBuilder(){};

        public UserBuilder(Long id, String name, String email, Integer age) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.age = age;
        }
        public UserBuilder id(Long id){
            this.id = id;
            return this;
        }

        public UserBuilder name(String name){
            this.name = name;
            return this;
        }

        public UserBuilder email(String email){
            this.email = email;
            return this;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}
