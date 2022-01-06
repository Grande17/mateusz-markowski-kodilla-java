package com.kodilla.good.patterns.challenges.onlineshop;

public class OrderProcessor {
    private InformationService informationService;
    private OrderRepository orderRepository;
    private OrderService orderService;

    public OrderProcessor(final InformationService informationService, final OrderRepository orderRepository, final OrderService orderService) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
        this.orderService = orderService;
    }
    public OrderDTO process( final OrderRequest orderRequest){
        boolean isSold = orderService.sell(orderRequest.getUser(),orderRequest.getDate(),orderRequest.getProduct(),orderRequest.getQty());
        if (isSold){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(),orderRequest.getDate(),orderRequest.getProduct(),orderRequest.getQty());
            return new OrderDTO(orderRequest.getUser(),orderRequest.getProduct(),orderRequest.getDate(),orderRequest.getQty(), true);
        }else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDate(), orderRequest.getQty(), false);
        }
    }
}
