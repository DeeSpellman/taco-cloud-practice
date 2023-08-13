package springinaction.tacocloudpractice;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import springinaction.tacocloudpractice.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save(Ingredient ingredient);

}

