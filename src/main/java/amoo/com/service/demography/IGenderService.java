package amoo.com.service.demography;

import amoo.com.domain.demography.Gender;
import amoo.com.service.IService;

import java.util.Set;

public interface IGenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
