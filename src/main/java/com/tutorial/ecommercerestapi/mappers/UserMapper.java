package com.tutorial.ecommercerestapi.mappers;

import com.tutorial.ecommercerestapi.dtos.UserDto;
import com.tutorial.ecommercerestapi.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
