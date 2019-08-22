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

    public RentalDto process(OrderRequest orderRequest) {
        boolean isRented = orderService.orderProcessing(orderRequest);

        if(isRented) {
            informationService.inform(orderRequest.getUser());
            orderRepository.addOrderToRepository(orderRequest.getUser(), orderRequest.getObjectsToBuy());
            return new RentalDto(orderRequest.getUser(), true);
        } else {
            return new RentalDto(orderRequest.getUser(), false);
        }
    }
}
