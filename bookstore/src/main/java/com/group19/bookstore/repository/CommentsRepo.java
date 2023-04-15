package com.group19.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.group19.bookstore.models.Comments;

import java.util.List;

public interface CommentsRepo extends JpaRepository <Comments, String> {
    List<Comments> findCommentsByBookID(String bookID);

}
