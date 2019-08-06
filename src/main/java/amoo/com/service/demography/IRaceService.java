package amoo.com.service.demography;

import amoo.com.domain.demography.Race;
import amoo.com.service.IService;

import java.util.Set;

public interface IRaceService extends IService<Race, String> {
    Set<Race> getAll();
}
