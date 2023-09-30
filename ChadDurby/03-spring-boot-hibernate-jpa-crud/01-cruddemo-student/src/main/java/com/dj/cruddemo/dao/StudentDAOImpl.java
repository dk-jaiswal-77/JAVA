package com.dj.cruddemo.dao;

import com.dj.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;

import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO{
    // define fields for entity manager
    private EntityManager entityManager;

    // inject entity manger using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement save method
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student); //save student
    }

    // implement findById method
    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class, id);
    };

    @Override
    public List<Student> findAll() {
        // create query
        // FROM Student ORDER BY firstName
        // by default, ascending (asc)
        TypedQuery<Student> theQuery =  entityManager.createQuery("FROM Student ORDER BY firstName desc", Student.class);
        // return query result
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {
        // create query
        TypedQuery<Student> theQuery =  entityManager.createQuery("FROM Student WHERE lastName=:data", Student.class);
        // set query parameter
        theQuery.setParameter("data", lastName);
        // return query results
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        // retrieve student based on id: primary key
        Student student = entityManager.find(Student.class, id);
        // delete student
        entityManager.remove(student);
    }

    @Override
    @Transactional
    public int deleteAll() {
        Integer deletedRowsCount = entityManager.createQuery(
                "DELETE FROM Student"
            ).executeUpdate();
        return deletedRowsCount;
    }
}
