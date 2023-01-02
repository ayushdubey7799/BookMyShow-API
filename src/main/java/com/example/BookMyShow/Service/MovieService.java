package com.example.BookMyShow.Service;

import com.example.BookMyShow.enums.dto.EntryDto.MovieEntryDto;
import com.example.BookMyShow.enums.dto.ResponseDto.MovieNameAndIdObject;
import com.example.BookMyShow.enums.dto.ResponseDto.MovieResponseDto;

public interface MovieService {

    MovieResponseDto addMovie(MovieEntryDto movieEntryDto);


    MovieResponseDto getMovie(int id);

    MovieNameAndIdObject getNameAndId(int id);


}
