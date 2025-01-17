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
 * @param type 
 * @param detail 
 * @param status 
 */
data class ProblemDetailsDto(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("detail", required = true) val detail: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: kotlin.Int
) {

}

