package fpt.fis.Repository;

import fpt.fis.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserResponsitory  extends JpaRepository<User,Long> {
    @Query("from User")
    public List<User> getAll();
}
