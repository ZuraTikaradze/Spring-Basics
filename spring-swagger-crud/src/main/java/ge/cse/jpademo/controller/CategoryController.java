package ge.cse.jpademo.controller;

import ge.cse.jpademo.dto.category.AddCategoryInput;
import ge.cse.jpademo.dto.category.AddCategoryOutput;
import ge.cse.jpademo.dto.category.GetCategoriesInput;
import ge.cse.jpademo.dto.category.GetCategoriesOutput;
import ge.cse.jpademo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/CategoryController")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping("getCategories")
    public GetCategoriesOutput getCategories(@RequestBody GetCategoriesInput getCategoriesInput) {
        return categoryService.getCategories(getCategoriesInput);
    }

    @PostMapping("addCategory")
    public AddCategoryOutput addCategory(@RequestBody AddCategoryInput addCategoryInput) {
        return categoryService.addCategory(addCategoryInput);
    }
}
