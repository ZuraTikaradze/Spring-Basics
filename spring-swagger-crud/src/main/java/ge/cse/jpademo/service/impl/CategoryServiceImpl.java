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
    CategoryRepository getCategories;

    @Override
    public GetCategoriesOutput getCategories(GetCategoriesInput getCategoriesInput) {

        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        GetCategoriesOutput categoriesOutput = new GetCategoriesOutput();
        for (Category category : getCategories.findAll()) {
            CategoryDTO categoryDTO = new CategoryDTO();
            categoryDTO.setId(category.getId());
            categoryDTO.setTitle(category.getTitle());
            categoryDTOList.add(categoryDTO);
        }
        categoriesOutput.setCategories(categoryDTOList);
        return categoriesOutput;
    }

    @Override
    public AddCategoryOutput addCategory(AddCategoryInput addCategoryInput) {
        Category category = new Category();
        category.setTitle(addCategoryInput.getTitle());
        getCategories.save(category);
        AddCategoryOutput addCategoryOutput = new AddCategoryOutput();
        addCategoryOutput.setMsg("კატეგორია წარმატებით შევინახეთ");
        return addCategoryOutput;
    }
}
