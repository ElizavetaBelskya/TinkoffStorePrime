package ru.tinkoff.storePrime.dto.location;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(description = "Адрес")
public class AddressDto {

    @Schema(description = "Улица", example = "Спартаковская")
    @NotBlank(message = "{address.street.notBlank}")
    private String street;

    @Schema(description = "Дом", example = "98")
    @NotBlank(message = "{address.house.notBlank}")
    private Integer house;

    @Schema(description = "Квартира/Корпус", example = "6А")
    private String apartment;

    private LocationDto location;


}
