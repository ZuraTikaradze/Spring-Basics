package ge.cse.jpademo.service.impl;

import ge.cse.jpademo.dto.category.*;
import ge.cse.jpademo.model.Category;
import ge.cse.jpademo.repository.CategoryRepository;
import ge.cse.jpademo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public GetCategoriesOutput getCategories(GetCategoriesInput getCategoriesInput) {

        GetCategoriesOutput getCategoriesOutput = new GetCategoriesOutput();
        List<CategoryDTO> categoryDTOS = new ArrayList<>();

        for (Category category : categoryRepository.findAll()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setTitle(category.getTitle());
            categoryDTOS.add(categoryDTO);
        }

        getCategoriesOutput.setCategories(categoryDTOS);
        return getCategoriesOutput;
    }

    @Override
    public AddCategoryOutput addCategory(AddCategoryInput addCategoryInput) {
        Category category = new Category();
        category.setTitle(addCategoryInput.getTitle());
        categoryRepository.save(category);

        AddCategoryOutput addCategoryOutput = new AddCategoryOutput();
        addCategoryOutput.setMsg("კატეგორია წარმატებით დაემატა");
        return addCategoryOutput;
    }
}
