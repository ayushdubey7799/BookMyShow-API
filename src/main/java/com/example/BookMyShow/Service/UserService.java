package com.example.BookMyShow.Service;

import com.example.BookMyShow.enums.dto.EntryDto.UserEntryDto;
import com.example.BookMyShow.enums.dto.ResponseDto.UserResponseDto;

public interface UserService {

    void addUser(UserEntryDto userEntryDto);

    UserResponseDto getUser(int id);


}
