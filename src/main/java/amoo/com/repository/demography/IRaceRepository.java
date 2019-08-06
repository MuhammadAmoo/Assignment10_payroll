package amoo.com.repository.demography;

import amoo.com.domain.demography.Race;
import amoo.com.repository.IRepository;

import java.util.Set;

public interface IRaceRepository extends IRepository<Race, String> {
    Set<Race> getAll();
}
