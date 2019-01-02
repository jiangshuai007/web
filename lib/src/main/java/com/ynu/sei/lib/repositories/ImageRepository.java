package com.ynu.sei.lib.repositories;

import com.ynu.sei.lib.domain.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
