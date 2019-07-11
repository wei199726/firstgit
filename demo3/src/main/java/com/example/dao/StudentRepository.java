package com.example.dao;

import com.example.pojo.Student;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    @Override
    List<Student> findAll();

    @Override
    List<Student> findAll(Sort sort);

    @Override
    List<Student> findAllById(Iterable<Integer> iterable);

    @Override
    <S extends Student> List<S> saveAll(Iterable<S> iterable);

    @Override
    void flush();

    @Override
    <S extends Student> S saveAndFlush(S s);

    @Override
    void deleteInBatch(Iterable<Student> iterable);

    @Override
    void deleteAllInBatch();

    @Override
    Student getOne(Integer integer);

    @Override
    <S extends Student> List<S> findAll(Example<S> example);

    @Override
    <S extends Student> List<S> findAll(Example<S> example, Sort sort);

    @Override
    Page<Student> findAll(Pageable pageable);

    @Override
    <S extends Student> S save(S s);

    @Override
    Optional<Student> findById(Integer integer);

    @Override
    boolean existsById(Integer integer);

    @Override
    long count();

    @Override
    void deleteById(Integer integer);

    @Override
    void delete(Student student);

    @Override
    void deleteAll(Iterable<? extends Student> iterable);

    @Override
    void deleteAll();
}
