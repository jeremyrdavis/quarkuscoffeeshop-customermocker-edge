package io.quarkuscoffeeshop.customermocker.domain;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.math.BigDecimal;
import java.util.*;

@RegisterForReflection
public class PlaceOrderCommand {

    private final CommandType commandType = CommandType.PLACE_ORDER;
    List<OrderLineItem> baristaLineItems;
    List<OrderLineItem> kitchenLineItems;
    private String id;
    private String location;
    private OrderSource orderSource;
    private String loyaltyMemberId;
    private BigDecimal total;

    public PlaceOrderCommand() {
    }

    public PlaceOrderCommand(String id, String location, OrderSource orderSource, String loyaltyMemberId, List<OrderLineItem> baristaItems, List<OrderLineItem> kitchenLineItems, BigDecimal total) {
        this.id = id;
        this.orderSource = orderSource;
        this.location = location;
        this.loyaltyMemberId = loyaltyMemberId;
        this.baristaLineItems = baristaItems;
        this.kitchenLineItems = kitchenLineItems;
        this.total = total;
    }

    public Optional<String> getLoyaltyMemberId() {
        return Optional.ofNullable(loyaltyMemberId);
    }

    public Optional<List<OrderLineItem>> getBaristaLineItems() {
        return Optional.ofNullable(baristaLineItems);
    }

    public Optional<List<OrderLineItem>> getKitchenLineItems() {
        return Optional.ofNullable(kitchenLineItems);
    }

    public void addKitchenLineItem(final OrderLineItem orderLineItem) {
        if (getKitchenLineItems().isPresent()) {
            getKitchenLineItems().get().add(orderLineItem);
        }else {
            this.kitchenLineItems = Arrays.asList(orderLineItem);
        }
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", PlaceOrderCommand.class.getSimpleName() + "[", "]")
                .add("commandType=" + commandType)
                .add("baristaLineItems=" + baristaLineItems)
                .add("kitchenItems=" + kitchenLineItems)
                .add("id='" + id + "'")
                .add("storeId='" + location + "'")
                .add("orderSource=" + orderSource)
                .add("rewardsId='" + loyaltyMemberId + "'")
                .add("total=" + total)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlaceOrderCommand that = (PlaceOrderCommand) o;
        return commandType == that.commandType &&
                Objects.equals(baristaLineItems, that.baristaLineItems) &&
                Objects.equals(kitchenLineItems, that.kitchenLineItems) &&
                Objects.equals(id, that.id) &&
                Objects.equals(location, that.location) &&
                orderSource == that.orderSource &&
                Objects.equals(loyaltyMemberId, that.loyaltyMemberId) &&
                Objects.equals(total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(commandType, baristaLineItems, kitchenLineItems, id, location, orderSource, loyaltyMemberId, total);
    }

    public CommandType getCommandType() {
        return commandType;
    }

    public String getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public OrderSource getOrderSource() {
        return orderSource;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setBaristaLineItems(List<OrderLineItem> baristaLineItems) {
        this.baristaLineItems = baristaLineItems;
    }

    public void setKitchenLineItems(List<OrderLineItem> kitchenLineItems) {
        this.kitchenLineItems = kitchenLineItems;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setOrderSource(OrderSource orderSource) {
        this.orderSource = orderSource;
    }

    public void setLoyaltyMemberId(String loyaltyMemberId) {
        this.loyaltyMemberId = loyaltyMemberId;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
