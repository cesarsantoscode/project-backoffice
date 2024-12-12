package pe.edu.cibertec.project_backoffice.service;

import pe.edu.cibertec.project_backoffice.dto.UserDetailDto;
import pe.edu.cibertec.project_backoffice.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {

    List<UserDto> getAllUsers() throws Exception;

    Optional<UserDetailDto> getUserById(int id) throws Exception;

    boolean updateUser(UserDto userDto) throws Exception;

    boolean deleteUserById(int id) throws Exception;

    boolean addUser(UserDetailDto userDetailDto) throws Exception;

}
