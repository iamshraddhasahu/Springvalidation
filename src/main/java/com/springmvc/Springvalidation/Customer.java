package com.springmvc.Springvalidation;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotNull(message = "is required")
    @Size(min=1,message="is required")
    private String lastName;


    @NotNull(message = "age is required")
    @Min(value = 18, message = "age must be 18 or greater than 18")
    @Max(value = 50, message = "age must be less than or equal to 50")
    public int getAge() {
        return age;
    }

    public void setAge(@NotNull(message = "age is required") @Min(value = 18, message = "age must be 18 or greater than 18") @Max(value = 50, message = "age must be less than or equal to 50") int age) {
        this.age = age;
    }

    @NotNull(message="age is required")
    @Min(value=18,message="age must be 18 or greater than 18")
    @Max(value=50, message ="age must be less than or equal to 50")
    private int age;


    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName) {
        this.lastName = lastName;
    }





    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public Customer(){

    }

   }
