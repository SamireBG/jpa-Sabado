package pe.edu.cibertec.queries;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import pe.edu.cibertec.domain.Libro;

import java.util.List;

public class JPAQuery {
    public static void main(String[] args) {
        // referenciar a la unidad de persistencia
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("biblioteca");
        EntityManager em = emf.createEntityManager();

        //select para seleccionar los datos de la  tabla
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l", Libro.class);

        //para seleccionar los datos buscados por columna
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor = :autor", Libro.class);
        //query.setParameter("autor", "Claudia");

        // comparativos (> < =)
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio > :precio", Libro.class);
        //query.setParameter("precio", 50);

        // select - between
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.precio between :inicio and :fin", Libro.class);
        //query.setParameter("inicio", 30);
        //query.setParameter("fin", 50);

        // select - where - in
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where l.autor in ('Cesar','Claudia')", Libro.class);

        // select - valores escalares
        //TypedQuery<String> query = em.createQuery("select l.autor from Libro l where l.autor in ('Cesar','Claudia')", String.class);

        // select - valores escalares
        //TypedQuery<String> query = em.createQuery("select distinct upper(l.autor) from Libro l where l.autor in ('Cesar','Claudia')", String.class);

        //select order by
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l order by l.precio", Libro.class);

        //select group by
        //TypedQuery<Object[]> query = em.createQuery("select l.autor, count(l) from Libro l group by l.autor", Object[].class);

        //select - is null
        //TypedQuery<Libro> query = em.createQuery("select l from Libro l where  l.autor is null", Libro.class);

        //select - is null
        TypedQuery<Libro> query = em.createQuery("select l from Libro l where  l.titulo like 'c%'", Libro.class);

        //obtener resultados
        List<Libro> resultado = query.getResultList();
        //List<String> resultado = query.getResultList();
        //List<Object[]> resultado = query.getResultList();

        //para buscar los datos de la tabla
        //resultado.forEach(System.out::println);

        //para buscar una columna de una tabla
        //resultado.forEach(item -> System.out.println(item.getTitulo()));

        resultado.forEach(System.out::println);
        //resultado.forEach(elemento -> System.out.println("Autor: " + elemento[0] + "--" + "Cantidad: " + elemento[1]));
    }
}
