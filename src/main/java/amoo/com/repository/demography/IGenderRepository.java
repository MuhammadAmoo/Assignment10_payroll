package amoo.com.repository.demography;

import amoo.com.domain.demography.Gender;
import amoo.com.repository.IRepository;

import java.util.Set;

public interface IGenderRepository extends IRepository<Gender, String> {
    Set<Gender> getAll();
}
