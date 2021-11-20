package ru.mirea.personalloyalty.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.mirea.personalloyalty.exceptions.EntityNotFoundException;
import ru.mirea.personalloyalty.mapper.OrderHistoryMapper;
import ru.mirea.personalloyalty.model.domain.OrderHistory;
import ru.mirea.personalloyalty.model.entity.dao.OrderHistoryDao;

@Service
public class ApplicationService {
    //private final RestTemplate restTemplate;

    //public ApplicationService(RestTemplate restTemplate) {
        //this.restTemplate = restTemplate;
    //}
    @Autowired
    private OrderHistoryDao orderHistoryDao;

    public OrderHistory getOrderHistoryByClientName(String name) throws EntityNotFoundException {
        OrderHistory orderHistory = OrderHistoryMapper.ORDER_HISTORY_MAPPER.entityToDomain(orderHistoryDao.findOrderHistoryEntityByClientEntity_Name(name));
        if (orderHistory != null)
        {
            return orderHistory;
        }
        else {
            throw new EntityNotFoundException();
        }
    }
}
