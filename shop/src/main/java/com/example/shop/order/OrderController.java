package com.example.shop.order;


import com.example.shop.order.Order;
// import com.example.shop.order.dto.OrderCreateRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import lombok.RequiredArgsConstructor;

import java.net.URI;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<Void> createOrder(@RequestBody OrderCreateRequest request) {
        Long orderID = orderService.createOrder(request);
        return ResponseEntity.created(URI.create("/orders/" + orderID)).build();
    }

    @GetMapping
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> Orders = orderService.getAllOrders();
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/{orderID}")
    public ResponseEntity<Order> getOrder(@PathVariable Long orderID) {
        Order order = orderService.getOrderByID(orderID);
        return ResponseEntity.ok(order);
    }

    @DeleteMapping("/{orderID}")
    public ResponseEntity<Void> deleteOrder(@PathVariable Long orderID) {
        orderService.deleteOrder(orderID);
        return ResponseEntity.noContent().build(); // 204 no content
    }



}