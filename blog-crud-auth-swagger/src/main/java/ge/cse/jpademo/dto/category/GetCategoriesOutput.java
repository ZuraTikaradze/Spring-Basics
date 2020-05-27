package ge.cse.jpademo.dto.category;

import lombok.Data;

import java.util.List;

@Data
public class GetCategoriesOutput {
    List<CategoryDTO> categories;
}
