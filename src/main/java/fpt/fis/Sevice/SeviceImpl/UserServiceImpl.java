package fpt.fis.Sevice.SeviceImpl;

import fpt.fis.DTO.UserDTO;
import fpt.fis.Model.User;
import fpt.fis.Repository.UserResponsitory;
import fpt.fis.Sevice.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserResponsitory userResponsitory;
    private ModelMapper modelMapper=new ModelMapper();

    @Override
    public List<UserDTO> getAll() {
        List<User> users = userResponsitory.getAll();
        List<UserDTO> userDtos = users.stream().map(user -> modelMapper
                .map(user, UserDTO.class)).collect(Collectors.toList());
        return userDtos;
    }

    @Override
    public User Updated(User user1) {
        User user=userResponsitory.findById(user1.getId()).orElse(null);
        user.setUserName(user1.getUserName());
        user.setPassword(user1.getPassword());
        userResponsitory.save(user);
        return user;
    }
    @Override
    public User Add(User user1) {
        User user=userResponsitory.save(user1);
        return userResponsitory.findById(user1.getId()).orElse(null);
    }
    @Override
    public User Deleted(User user1){
        User user=userResponsitory.findById(user1.getId()).orElse(null);
        userResponsitory.delete(user);
        return userResponsitory.findById(user.getId()).orElse(null);
    }
}
