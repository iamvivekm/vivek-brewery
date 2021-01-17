package vivek.framework.vivekbrewery.service;

import org.springframework.stereotype.Service;
import vivek.framework.vivekbrewery.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Vivek Mangalath").build();
    }
}
