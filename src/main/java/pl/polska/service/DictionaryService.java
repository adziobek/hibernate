package pl.polska.service;

import pl.polska.model.Dictionary;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@Service
public class DictionaryService {

    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("Hibernate_JPA");
    EntityManager em = emfactory.createEntityManager();


    public void addDictionary(String dictName) {
        Dictionary dictionary = new Dictionary(dictName, "", false);
        em.getTransaction().begin();
        em.persist(dictionary);
        em.getTransaction().commit();
        em.close();
        emfactory.close();
    }

}
