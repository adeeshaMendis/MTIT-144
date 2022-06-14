package com.mtit.customerservice.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AccountDetails {
    @ApiModelProperty(notes = "Customer's first name")
    private String customerFirstName;
    @ApiModelProperty(notes = "Customer's last name")
    private String customerLastName;
    @ApiModelProperty(notes = "Customer's address")
    private String address;
    @ApiModelProperty(notes = "Customer's email address")
    private String email;
    @ApiModelProperty(notes = "Customer's phone number")
    private String phoneNumber;

}
