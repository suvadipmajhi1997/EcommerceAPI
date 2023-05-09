package com.example.EcommerceAPI.controllers;

import com.example.EcommerceAPI.models.Order;
import com.example.EcommerceAPI.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public Order createOrder(@RequestParam("userId") Integer userId,
                             @RequestParam("productId") Integer productId,
                             @RequestParam("addressId") Integer addressId,
                             @RequestParam("productQuantity") Integer productQuantity) {
        String response;
        HttpStatus status;
        try{
            orderService.createOrder(userId, productId, addressId, productQuantity);
            response=" your order is placed successfully!!!!";
            status=HttpStatus.CREATED;
        }
        catch (Exception e){
            status=HttpStatus.BAD_REQUEST;
            response =" invalid order details!!!";
        }
        return new ResponseEntity<String>(response,status);
    }

    @GetMapping("/{orderId}")
    public ResponseEntity<Order> getOrderById(@PathVariable("orderId") Integer orderId) {
        Optional<Order>orderObj= orderService.getOrderById(orderId);
        return orderObj.map(value->new ResponseEntity<>(value, HttpStatus.FOUND))
                .orElseGet(()->new ResponseEntity<>(HttpStatus.NOT_FOUND));

    }
}
