package ge.cse.jpademo.service;

import ge.cse.jpademo.dto.category.AddCategoryInput;
import ge.cse.jpademo.dto.category.AddCategoryOutput;
import ge.cse.jpademo.dto.category.GetCategoriesInput;
import ge.cse.jpademo.dto.category.GetCategoriesOutput;
import ge.cse.jpademo.model.Category;

public interface CategoryService {
    // კატეგორიების წამოღება
    GetCategoriesOutput getCategories(GetCategoriesInput getCategoriesInput);

    // კატეგორიების დამატება
    AddCategoryOutput addCategory(AddCategoryInput addCategoryInput);
}
