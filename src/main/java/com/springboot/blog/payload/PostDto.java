package com.springboot.blog.payload;

//import com.spring boot.blog.entity.Comment;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
//import lombok.Getter;
//import lombok.Setter;
//import lombok.Singular;
import java.util.Set;

@Data
@NotEmpty

public class PostDto {
    private long id;

    //title should not be null or empty
    //title should have at least 2 characters

    private String title;
    private String description;
    private String content;
    private Set<CommentDto> comments;
}
