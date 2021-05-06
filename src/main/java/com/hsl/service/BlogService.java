package com.hsl.service;

import com.hsl.model.Blog;
import com.hsl.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Iterable<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public Iterable<Blog> findAllByCategoryId(Long categoryId) {
        return blogRepository.findAllByCategoryId(categoryId);
    }

    @Override
    public Iterable<Blog> findAllByCategoryName(String name) {
        return blogRepository.findAllByCategory_Name(name);
    }

    @Override
    public Blog save(Blog customer) {
        return blogRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }
}
