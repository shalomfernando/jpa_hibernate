package br.com.usjt.jpa_hibernate.teste;

import javax.persistence.Persistence;

public class TesteCriarBaseTabelas {
    public static void main(String[] args) {
        Persistence.createEntityManagerFactory("usjtPU");
    }
}
