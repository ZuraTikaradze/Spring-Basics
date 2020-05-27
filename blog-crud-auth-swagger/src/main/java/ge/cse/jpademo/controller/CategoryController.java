package ge.cse.jpademo.controller;

import ge.cse.jpademo.dto.category.AddCategoryInput;
import ge.cse.jpademo.dto.category.AddCategoryOutput;
import ge.cse.jpademo.dto.category.GetCategoriesInput;
import ge.cse.jpademo.dto.category.GetCategoriesOutput;
import ge.cse.jpademo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/CategoryController")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @PostMapping("categories")
    public GetCategoriesOutput getCategories(@RequestBody GetCategoriesInput getCategoriesInput) {
        return categoryService.getCategories(getCategoriesInput);
    }

    @PostMapping("category")
    public AddCategoryOutput addCategory(@RequestBody AddCategoryInput addCategoryInput){
        return categoryService.addCategory(addCategoryInput);
    }

}
