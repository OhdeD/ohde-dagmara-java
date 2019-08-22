package com.kodilla.good.patterns.challenges;


public class OrderProcessor  {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.orderProcessing(orderRequest);

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.addOrderToRepository(orderRequest.getUser(), orderRequest.getObjectsToBuy());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
