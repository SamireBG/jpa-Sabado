package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Libro;

public class JPARemove {
    public static void main(String[] args) {
        // referenciar a la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //referenciar libro
        Libro libro = em.find(Libro.class, "A3");
        System.out.println(libro.toString());

        //eliminar libro
        em.getTransaction().begin();
        em.remove(libro);
        em.getTransaction().commit();
    }
}
