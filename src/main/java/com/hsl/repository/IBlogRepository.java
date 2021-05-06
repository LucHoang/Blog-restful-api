package com.hsl.repository;

import com.hsl.model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategoryId(Long categoryId);
    Iterable<Blog> findAllByCategory_Name(String name);
}
