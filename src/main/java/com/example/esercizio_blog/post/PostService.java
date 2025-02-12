package com.example.esercizio_blog.post;

import general.CreateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public List<Post> findAll() {
        return postRepository.findAll();
    }

    public CreateResponse save (PostRequest request) {
        Post post = new Post();
        BeanUtils.copyProperties(request, post);
        postRepository.save(post);

        CreateResponse response = new CreateResponse();
        response.setId(post.getId_post());
        return response;
    }

    public Post findById(Long id) {
        return postRepository.findById(id).get();
    }
}
