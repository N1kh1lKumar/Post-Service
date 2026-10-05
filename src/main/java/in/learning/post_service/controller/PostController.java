package in.learning.post_service.controller;


import in.learning.post_service.entity.Post;
import in.learning.post_service.entity.Response;
import in.learning.post_service.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @PostMapping(path = "/posts")
    public Response createPost(@Validated @RequestBody Post post){
        return postService.createPost(post);
    }

    @GetMapping(path = "/posts")
    public Response getPost(){
         return postService.getPost();
    }

    @GetMapping(path = "/posts/{id}")
    public Response getPostById(@PathVariable Long id){
         return postService.getPostById(id);
    }

    @PutMapping(path = "/posts/{id}")
    public Response updatePost(@RequestBody Post post ,@PathVariable Long id){
            return postService.updatePost(post, id);
    }

    @DeleteMapping(path="/posts/{id}")
    public Response deletePost(@PathVariable Long id){
        return postService.deletePost(id);
    }
}
