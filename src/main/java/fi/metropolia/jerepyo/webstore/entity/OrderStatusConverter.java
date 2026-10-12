package fi.metropolia.jerepyo.webstore.entity;

import fi.metropolia.jerepyo.webstore.entity.OrderStatus;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = false)
public class OrderStatusConverter
        implements AttributeConverter<OrderStatus, String> {

    @Override
    public String convertToDatabaseColumn(OrderStatus status) {

        if (status == null) {
            return null;
        }

        return status.name();
    }

    @Override
    public OrderStatus convertToEntityAttribute(String dbValue) {

        if (dbValue == null) {
            return null;
        }

        return OrderStatus.valueOf(dbValue);
    }
}
