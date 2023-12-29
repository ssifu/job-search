package com.ssifu.jobsearch.repository;

import com.ssifu.jobsearch.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post, String> {

}
