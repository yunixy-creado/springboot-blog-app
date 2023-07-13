package com.springboot.blog.payload;

//import com.spring boot.blog.entity.Comment;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.Singular;
import java.util.Set;

@Data
public class PostDto {
    private long id;

    //title should not be null or empty
    //title should have at least 2 characters
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    //post description should be not null or empty
    //post description should have at least 10 characters
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;

    //post content should not be null or empty
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;
}
