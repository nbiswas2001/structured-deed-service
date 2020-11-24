package uk.gov.ros.lr.deed.structured.endpoints;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ErrorResponseEntity {

    public HttpStatus httpStatus;
    public String message;

    //--------------------------------------------------------------
    public static ErrorResponseEntity status(HttpStatus httpStatus){
        ErrorResponseEntity resp = new ErrorResponseEntity();
        resp.httpStatus = httpStatus;
        return resp;
    }

    //-------------------------------------------------------------
    public ResponseEntity body(String message){
        this.message = message;
        return ResponseEntity.status(httpStatus).body(this);
    }
}
