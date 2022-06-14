package com.mtit.ecommerceapp.controller;

import com.mtit.ecommerceapp.dto.AccountDetails;
import com.mtit.ecommerceapp.response.AccountResponse;
import io.swagger.annotations.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/retailCustomer")
@Tag(name = "Retail Customers Management Application")
@Api(tags = "Retail Customers Management Application")

public class AccountController {
    @ApiOperation(value = "Create a new account for customer")
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 200, message = "Ok", response = AccountResponse.class)})
    @PostMapping("/createNewAccount")
    ResponseEntity<AccountResponse> createNewAccount(@RequestBody AccountDetails accountDetails) {
        var accountResponse = AccountResponse.builder()
                .message("Create account development is in progres")
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(accountResponse);
    }

    @ApiOperation(value = "Get all customers accounts")
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 200, message = "Ok", response = AccountResponse.class)})
    @GetMapping("/getAllAccount")
    ResponseEntity<AccountResponse> getAllAccount() {
        var accountResponse = AccountResponse.builder()
                .message("Get all account development is in progres")
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(accountResponse);
    }


    @ApiOperation(value = "Get the account details of a customer")
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 200, message = "Ok", response = AccountResponse.class)})
    @GetMapping("/getAccountForCustomer")
    ResponseEntity<AccountResponse> getAccountForCustomer(
            @ApiParam(value = "Customer name for which account details is needed",
                    type = "String", required = true)
            @RequestParam(value = "customerName") String customerName) {

        var accountResponse = AccountResponse.builder()
                .message("Get all account development is in progress")
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(accountResponse);
    }


    @ApiOperation(value = "Update customer account details")
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 200, message = "Ok", response = AccountResponse.class)})
    @PutMapping("/updateAccount")
    ResponseEntity<AccountResponse> updateAccount(@RequestBody AccountDetails accountDetails) {
        var accountResponse = AccountResponse.builder()
                .message("Update account development is in progres")
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(accountResponse);
    }


    @ApiOperation(value = "Delete customer account details")
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Internal server error"),
            @ApiResponse(code = 200, message = "Ok", response = AccountResponse.class)})
    @DeleteMapping("/deleteAccount")
    ResponseEntity<AccountResponse> deleteAccount(@RequestBody AccountDetails accountDetails) {
        var accountResponse = AccountResponse.builder()
                .message("Update account development is in progres")
                .build();
        return ResponseEntity.status(HttpStatus.OK).body(accountResponse);
    }
}
