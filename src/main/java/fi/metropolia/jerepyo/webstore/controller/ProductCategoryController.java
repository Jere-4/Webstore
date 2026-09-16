package fi.metropolia.jerepyo.webstore.controller;

import fi.metropolia.jerepyo.webstore.repository.ProductCategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductCategoryController {

    private final ProductCategoryRepository repository;

    public ProductCategoryController(ProductCategoryRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/categories")
    public String showCategories(Model model) {

        model.addAttribute(
                "categories",
                repository.findAll()
        );

        return "categories";
    }
}
