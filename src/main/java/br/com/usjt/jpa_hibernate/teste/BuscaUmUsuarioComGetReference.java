package br.com.usjt.jpa_hibernate.teste;

import br.com.usjt.jpa_hibernate.model.JPAUtil;
import br.com.usjt.jpa_hibernate.model.Usuario;

import javax.persistence.EntityManager;
import javax.xml.bind.JAXBPermission;

public class BuscaUmUsuarioComGetReference {
    public static void main(String[] args) {
        EntityManager manager = JPAUtil.getEntityManager();
        Usuario u = manager.getReference(Usuario.class ,1L);
        System.out.println("ja executou a query?");
        System.out.println(u);
        System.out.println("E agora:");
        manager.close();
        JPAUtil.close();
    }
}
