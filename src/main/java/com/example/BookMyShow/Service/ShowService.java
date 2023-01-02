package com.example.BookMyShow.Service;

import com.example.BookMyShow.enums.dto.EntryDto.ShowEntryDto;
import com.example.BookMyShow.enums.dto.ResponseDto.ShowResponseDto;
import com.example.BookMyShow.enums.dto.ResponseDto.UserResponseDto;

public interface ShowService {

    ShowResponseDto addShow(ShowEntryDto showEntryDto);

}
