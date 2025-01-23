package com.example.project.adapters.outbound.entities;

import jakarta.persistence.*; //Table, column, entity e GeneratedValue
import org.springframework.data.annotation.Id; //Spring DATA = identificação gerada pelo banco de dados

import java.util.UUID;

public class JPAUserEntity {

    @Entity
    @Table(name = "users")
    public class JPAUserEntity {

        @Column(name = "emails")
        private String email;

        private String password;

        @Id //Declaração de um valor único para cada instância
        @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
    Passa a geração e administração da identificação para o Spring, e não mais para a aplicação.
    IDENTITY - valor do identificador é responsabilidade do banco de dados
     */
        private UUID uuid;

        public JPAUserEntity(){

        }

        public JPAUserEntity(String email, String password){
            this.email = email;
            this.password = password;
            this.uuid = uuid;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public UUID getId() {
            return this.uuid;
        }

        public void setId(UUID uuid) {
            this.uuid = uuid;
        }

}
