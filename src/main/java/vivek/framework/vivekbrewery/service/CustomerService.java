package vivek.framework.vivekbrewery.service;

import vivek.framework.vivekbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    public CustomerDto getCustomerById(UUID id);
}
