package com.example.mybatisapp.category;

import java.util.List;

public interface ICategoryService {
    ICategory findById(Long id);
    ICategory findByName(String name);
    List<ICategory> getAllList();
    ICategory insert(ICategory category) throws Exception;
    Boolean delete(Long id) throws Exception;
    ICategory update(Long id, ICategory category) throws Exception;
    List<ICategory> findAllByNameContains(SearchCategoryDto dto);
    int countAllByNameContains(SearchCategoryDto searchCategoryDto);
}
