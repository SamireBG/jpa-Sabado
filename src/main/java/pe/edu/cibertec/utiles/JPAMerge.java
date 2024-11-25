package pe.edu.cibertec.utiles;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import pe.edu.cibertec.domain.Libro;

public class JPAMerge {
    public static void main(String[] args) {
        // referenciar a la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //referenciar libro
        Libro libro = em.find(Libro.class, "A1");
        libro.setTitulo("Cien años de soledad");
        libro.setAutor("Gabriel Garcia Marquez");


        //actualizar libro
        em.getTransaction().begin();
        em.persist(libro);
        em.getTransaction().commit();
    }
}
