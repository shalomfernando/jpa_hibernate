package br.com.usjt.jpa_hibernate.teste;

import br.com.usjt.jpa_hibernate.model.JPAUtil;
import br.com.usjt.jpa_hibernate.model.Usuario;

import javax.persistence.EntityManager;

public class BuscaUmUsuarioFind {

    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Usuario u = manager.find(Usuario.class, 1L);
        System.out.println(u);
        manager.close();
        JPAUtil.close();
    }
}
