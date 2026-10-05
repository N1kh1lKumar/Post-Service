package in.learning.post_service.service;


import in.learning.post_service.entity.Post;
import in.learning.post_service.entity.Response;
import org.springframework.stereotype.Service;

@Service
public interface PostService {

    Response createPost(Post post);
    Response getPost();
    Response getPostById(Long id);
    Response updatePost(Post post, Long id);
    Response deletePost(Long id);
}
