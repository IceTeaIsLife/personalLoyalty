package ru.mirea.personalloyalty.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.mirea.personalloyalty.mapper.OrderHistoryMapper;
import ru.mirea.personalloyalty.model.AppResponse;
import ru.mirea.personalloyalty.model.domain.OrderHistory;
import ru.mirea.personalloyalty.model.dto.OrderHistoryDto;
import ru.mirea.personalloyalty.service.ApplicationService;


@RestController
@CrossOrigin
@RequestMapping("api/personal-loyalty")
public class ApplicationController {
    private final ApplicationService applicationService;

    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("get-order-history")
    public ResponseEntity<AppResponse<OrderHistoryDto>> getOrderHistory(@RequestParam String name){
        try {
            OrderHistory orderHistory = applicationService.getOrderHistoryByClientName(name);
            OrderHistoryDto orderHistoryDto = OrderHistoryMapper.ORDER_HISTORY_MAPPER.domainToDto(orderHistory);
            return new ResponseEntity<>(AppResponse.ok(orderHistoryDto), HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(AppResponse.error(e.getMessage(), null), HttpStatus.NOT_FOUND);
        }
    }

}
