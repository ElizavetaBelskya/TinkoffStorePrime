package ru.tinkoff.storePrime.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ru.tinkoff.storePrime.models.CartItem;
import ru.tinkoff.storePrime.models.Product;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Schema(description = "Товар из корзины")
public class CartItemDto {

    @Schema(description = "Идентификатор товара в корзине", example = "123")
    private Long id;

    private ProductDto product;

    @Schema(description = "Идентификатор пользователя", example = "123")
    private Long customerId;

    public static CartItemDto from(CartItem cartItem) {
        return CartItemDto.builder()
                .id(cartItem.getId())
                .product(ProductDto.from(cartItem.getProduct()))
                .customerId(cartItem.getCustomer().getId())
                .build();
    }

    public static List<CartItemDto> from(List<CartItem> cartItems) {
        return cartItems.stream().map(CartItemDto::from)
                .collect(Collectors.toList());
    }


}
