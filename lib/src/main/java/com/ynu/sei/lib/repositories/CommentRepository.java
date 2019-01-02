package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, String> {
}
