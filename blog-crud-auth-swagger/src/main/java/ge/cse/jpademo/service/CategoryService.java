package ge.cse.jpademo.service;


import ge.cse.jpademo.dto.category.AddCategoryInput;
import ge.cse.jpademo.dto.category.AddCategoryOutput;
import ge.cse.jpademo.dto.category.GetCategoriesInput;
import ge.cse.jpademo.dto.category.GetCategoriesOutput;

public interface CategoryService {
    GetCategoriesOutput getCategories(GetCategoriesInput getCategoriesInput);

    AddCategoryOutput addCategory(AddCategoryInput addCategoryInput);
}
