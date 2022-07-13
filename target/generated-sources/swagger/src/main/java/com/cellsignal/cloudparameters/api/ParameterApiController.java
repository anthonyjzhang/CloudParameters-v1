package com.cellsignal.cloudparameters.api;

import com.cellsignal.cloudparameters.configuration.model.InlineResponse200;
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
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-07-12T21:50:12.372355-04:00[America/New_York]")
@RestController
public class ParameterApiController implements ParameterApi {

    private final ParameterApiDelegate delegate;

    @org.springframework.beans.factory.annotation.Autowired
    public ParameterApiController(ParameterApiDelegate delegate) {
        this.delegate = delegate;
    }

    @Override
    public ParameterApiDelegate getDelegate() {
        return delegate;
    }
    public ResponseEntity<InlineResponse200> getParameter(@NotNull @Parameter(in = ParameterIn.QUERY, description = "parameter key being queried" ,required=true,schema=@Schema()) @Valid @RequestParam(value = "key", required = true) String key) {
        return delegate.getParameter(key);
    }

}