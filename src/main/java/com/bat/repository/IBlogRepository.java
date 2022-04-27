package com.bat.repository;

import com.bat.model.Blog;
import com.bat.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBlogRepository extends PagingAndSortingRepository<Blog,Long> {
    Iterable<Blog> findAllByCategoryContaining(String category);
}
