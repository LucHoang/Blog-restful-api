package com.hsl.service;

import com.hsl.model.Blog;

import java.util.Optional;

public interface IBlogService extends IGeneralService<Blog>{
    Iterable<Blog> findAllByCategoryId(Long categoryId);
    Iterable<Blog> findAllByCategoryName(String name);
}
