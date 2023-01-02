package com.example.BookMyShow.enums.dto;

import com.example.BookMyShow.enums.dto.ResponseDto.ShowResponseDto;
import com.example.BookMyShow.enums.dto.ResponseDto.UserResponseDto;
import com.sun.istack.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TicketDto {

    int id;

    String alloted_seats;

    double amount;

    ShowResponseDto showDto;

    @NotNull
    UserResponseDto userDto;
}
