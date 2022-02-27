package com.example.demo.Repository;

import com.example.demo.Entity.SchoolInof;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolInfoRepository extends JpaRepository<SchoolInof, String> {
}
