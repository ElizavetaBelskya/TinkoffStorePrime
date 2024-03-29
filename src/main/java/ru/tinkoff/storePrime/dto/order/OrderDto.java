package ru.tinkoff.storePrime.dto.order;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ru.tinkoff.storePrime.dto.base.LongIdDto;
import ru.tinkoff.storePrime.dto.product.ProductDto;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Schema(description = "Заказ")
public class OrderDto extends LongIdDto {

    @Schema(description = "Статус заказа", example = "TRANSITING")
    private String status;

    private ProductDto product;

    @Schema(description = "Идентификатор пользователя", example = "123")
    private Long customerId;

    @Schema(description = "Количество товара в заказе", example = "3")
    private Integer quantity;


}
