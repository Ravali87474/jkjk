package com.org.pg.hostel.repository;

import com.org.pg.hostel.model.ModelHostelS;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface RepoHostel  extends JpaRepository <ModelHostelS,String>{
}
