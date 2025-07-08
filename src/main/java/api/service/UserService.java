package api.service;

import api.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}