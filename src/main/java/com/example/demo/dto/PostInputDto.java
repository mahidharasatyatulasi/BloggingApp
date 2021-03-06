package com.example.demo.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.constraints.Size;


import com.example.demo.bean.PostType;

import lombok.Data;

@Data
public class PostInputDto {
	
	private int postId;
	@Size(min = 3, max = 50, message = "Title should be of 3 to 50 characters")
	private String title;
	private PostType content;
	private LocalDateTime createdDateTime;
	private int votes;
	private boolean voteUp;
    private boolean notSafeForWork;
    private boolean spoiler;
    private boolean originalContent;
    private String flair;
    List<Integer> commentIds;
}
