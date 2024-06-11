package wby.chat.realtimechat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import wby.chat.realtimechat.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

}
