/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.7.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
*/
package io.github.projektalmanac.imani.generated.api

import io.github.projektalmanac.imani.generated.dto.EnviarQR200ResponseDto
import io.github.projektalmanac.imani.generated.dto.ProblemDetailsDto
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

import kotlin.collections.List
import kotlin.collections.Map

@Validated
interface ImagenesApi {

    @Operation(
        tags = ["imagenes",],
        summary = "Enviar imagen QR para un paciente",
        operationId = "enviarQR",
        description = """Enviar una imagen QR asociada a un paciente y recibir un ID único o un mensaje de error""",
        responses = [
            ApiResponse(responseCode = "200", description = "Imagen enviada exitosamente", content = [Content(schema = Schema(implementation = EnviarQR200ResponseDto::class))]),
            ApiResponse(responseCode = "400", description = "Error en el envío de la imagen", content = [Content(schema = Schema(implementation = ProblemDetailsDto::class))])
        ]
    )
    @RequestMapping(
            method = [RequestMethod.POST],
            value = ["/pacientes/{pacienteId}/enviar-qr"],
            produces = ["application/json"],
            consumes = ["multipart/form-data"]
    )
    fun enviarQR(@Parameter(description = "", required = true) @PathVariable("pacienteId") pacienteId: kotlin.Int,@Parameter(description = "Archivo de imagen a enviar") @Valid @RequestPart("archivo", required = false) archivo: org.springframework.core.io.Resource?): ResponseEntity<EnviarQR200ResponseDto>
}
