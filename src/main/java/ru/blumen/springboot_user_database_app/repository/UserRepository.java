package ru.blumen.springboot_user_database_app.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.blumen.springboot_user_database_app.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
