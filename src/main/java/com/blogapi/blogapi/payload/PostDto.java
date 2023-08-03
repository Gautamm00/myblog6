package com.blogapi.blogapi.payload;

import lombok.Data;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Data
public class PostDto {
        private long id;

        @NotEmpty
        @Size(min=2, message= "Should be at least 2 Character")
        private String title;

        @NotEmpty
        @Size(min=5, message= "Description Should be at least 5 character")
        private String description;

        @NotEmpty
        @Size(min=5, message= "Content Should be at least 5 character")
        private String content;

}
