package com.ssifu.jobsearch.repository;

import com.ssifu.jobsearch.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
