package io.swagger.api;

import io.swagger.model.Order;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-02-09T16:59:56.539Z[GMT]")
@RestController
public class OrderApiController implements OrderApi {

    private static final Logger log = LoggerFactory.getLogger(OrderApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Order> getOrderById(@Parameter(in = ParameterIn.PATH, description = "ID of Order to return", required=true, schema=@Schema()) @PathVariable("orderId") Long orderId) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Order>(objectMapper.readValue("{\n  \"orderId\" : 198772,\n  \"customerId\" : 0,\n  \"shipingAddress\" : {\n    \"zip\" : \"94301\",\n    \"city\" : \"Palo Alto\",\n    \"street\" : \"437 Lytton\",\n    \"state\" : \"CA\"\n  },\n  \"id\" : 10,\n  \"complete\" : true,\n  \"items\" : [ {\n    \"userAcceptedDelay\" : true,\n    \"quantity\" : 1,\n    \"telephoneNumber\" : \"409.406.3322\",\n    \"name\" : \"Apple Iphone XR\",\n    \"planId\" : \"skup1234\",\n    \"id\" : 100000,\n    \"delayAcceptedDate\" : \"2020-10-06T13:39:52.774-05:00\",\n    \"complete\" : true,\n    \"skuId\" : \"sku1234\",\n    \"status\" : \"ordered\",\n    \"estimatedShipDateRange\" : {\n      \"fromDate\" : \"2020-09-06T13:39:52.774-05:00\",\n      \"toDate\" : \"2020-09-06T13:39:52.774-05:00\"\n    }\n  }, {\n    \"userAcceptedDelay\" : true,\n    \"quantity\" : 1,\n    \"telephoneNumber\" : \"409.406.3322\",\n    \"name\" : \"Apple Iphone XR\",\n    \"planId\" : \"skup1234\",\n    \"id\" : 100000,\n    \"delayAcceptedDate\" : \"2020-10-06T13:39:52.774-05:00\",\n    \"complete\" : true,\n    \"skuId\" : \"sku1234\",\n    \"status\" : \"ordered\",\n    \"estimatedShipDateRange\" : {\n      \"fromDate\" : \"2020-09-06T13:39:52.774-05:00\",\n      \"toDate\" : \"2020-09-06T13:39:52.774-05:00\"\n    }\n  } ],\n  \"shipments\" : [ {\n    \"carrier\" : \"USPS\",\n    \"trackingUrl\" : \"https://tools.usps.com/go/TrackConfirmAction?tRef=fullpage&tLc=2&text28777=&tLabels=9400100000000000000000%2C\",\n    \"id\" : 1,\n    \"shipDate\" : \"2020-10-02T13:39:52.774-05:00\",\n    \"items\" : [ 100000, 100000 ],\n    \"trackingNumber\" : \"9400100000000000000000\",\n    \"estimatedDeliveryDate\" : \"2020-10-06T13:39:52.774-05:00\"\n  }, {\n    \"carrier\" : \"USPS\",\n    \"trackingUrl\" : \"https://tools.usps.com/go/TrackConfirmAction?tRef=fullpage&tLc=2&text28777=&tLabels=9400100000000000000000%2C\",\n    \"id\" : 1,\n    \"shipDate\" : \"2020-10-02T13:39:52.774-05:00\",\n    \"items\" : [ 100000, 100000 ],\n    \"trackingNumber\" : \"9400100000000000000000\",\n    \"estimatedDeliveryDate\" : \"2020-10-06T13:39:52.774-05:00\"\n  } ],\n  \"status\" : \"ordered\"\n}", Order.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Order>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Order>(HttpStatus.NOT_IMPLEMENTED);
    }

}
