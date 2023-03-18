package kodlama.io.rentACars.repository.concretes;

import kodlama.io.rentACars.entities.concretes.Brand;
import kodlama.io.rentACars.repository.abstracts.BrandRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
// Test
    private List<Brand> brands;

    public InMemoryBrandRepository() {
        brands = new ArrayList<>();
        brands.add(new Brand(1,"Mecedes"));
        brands.add(new Brand(2,"BMW"));
        brands.add(new Brand(3,"Audi"));
        brands.add(new Brand(4,"Opel"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
