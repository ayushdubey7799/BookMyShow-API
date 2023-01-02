package com.example.BookMyShow.enums.dto.ResponseDto;

import com.example.BookMyShow.enums.dto.TicketDto;
import lombok.*;

import java.util.List;

@Data
@Builder
public class UserResponseDto {

    int id;

    String name;

    String mobNo;

    //Optional
    List<TicketDto> tickets;
}
