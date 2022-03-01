package com.managefile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.managefile.models.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String>{

}
