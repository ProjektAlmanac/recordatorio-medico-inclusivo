package io.github.projektalmanac.imani.generated.dto

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param nombre 
 * @param apellidos 
 * @param nombreUsuario 
 */
data class FarmaceuticoDto(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("nombre", required = true) val nombre: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("apellidos", required = true) val apellidos: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("nombreUsuario", required = true) val nombreUsuario: kotlin.String
) {

}
