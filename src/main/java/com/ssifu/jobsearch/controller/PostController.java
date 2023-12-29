package com.ssifu.jobsearch.controller;

import com.ssifu.jobsearch.repository.PostRepository;
import com.ssifu.jobsearch.model.Post;
import com.ssifu.jobsearch.repository.SearchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private SearchRepository searchRepository;

    @GetMapping("/posts")
    public ResponseEntity<List<Post>> getAllPosts() {
        return new ResponseEntity<List<Post>>(postRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping("/posts/search/{text}")
    public ResponseEntity<List<Post>> search(@PathVariable String text) {
        return new ResponseEntity<List<Post>>(searchRepository.findByText(text), HttpStatus.OK);
    }

    @PostMapping("/posts/add")
    public ResponseEntity<Post> createPost(@RequestBody Post post) {
        return new ResponseEntity<Post>(postRepository.insert(post), HttpStatus.CREATED);
    }
}
