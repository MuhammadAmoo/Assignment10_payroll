package amoo.com.service.demography;

import amoo.com.repository.demography.GenderRepository;
import amoo.com.repository.demography.IGenderRepository;
import amoo.com.domain.demography.Gender;

import java.util.Set;

public class GenderService implements IGenderService{

    private static GenderService service = null;
    private IGenderRepository repository;

    private GenderService()
    {
        this.repository = GenderRepository.getRepository();
    }

    public static GenderService getService()
    {
        if(service == null){service = new GenderService();}
    return service;
    }

    @Override
    public Set<Gender> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public Gender create(Gender gender)
    {
        return this.repository.create(gender);
    }

    @Override
    public Gender read(String s)
    {
        return this.repository.read(s);
    }

    @Override
    public Gender update(Gender gender)
    {
        return this.repository.update(gender);
    }

    @Override
    public void delete(String s) {
       this.repository.delete(s);
    }
}
