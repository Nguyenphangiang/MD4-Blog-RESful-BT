package com.bat.service.blog;

import com.bat.model.Blog;
import com.bat.model.Category;
import com.bat.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService {
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
    public Iterable<Blog> findAllByCategory(String category){
        return blogRepository.findAllByCategoryContaining(category);
    }
}
