package dao;

import interfaces.IStudent;
import jakarta.persistence.EntityManager;
import models.Student;

import java.util.List;

public class StudentDAO implements IStudent {
    public void save(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
    }

    public Student getStudent(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Student.class, id);
    }

    public void update(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }

    public void delete(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(student);
        em.getTransaction().commit();
    }

    public List<Student> getStudents() {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.createQuery("SELECT s FROM Student s").getResultList();
    }
}
