package com.ssifu.jobsearch;

import com.ssifu.jobsearch.model.Post;
import com.ssifu.jobsearch.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;
    public List<Post> allPosts() {
        return postRepository.findAll();
    }
}
