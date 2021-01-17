package vivek.framework.vivekbrewery.service;

import vivek.framework.vivekbrewery.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);
}
