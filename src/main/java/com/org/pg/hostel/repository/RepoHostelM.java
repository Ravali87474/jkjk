package com.org.pg.hostel.repository;

import com.org.pg.hostel.model.ModelHostelM;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableMongoRepositories
public interface RepoHostelM extends MongoRepository<ModelHostelM,String> {
}
