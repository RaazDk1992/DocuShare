package com.raazdk.Docushare.repository;

import com.raazdk.Docushare.models.DocushareUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepository  extends JpaRepository<DocushareUser,Long> {
    Optional<DocushareUser>findByUserName(String username);

    boolean existsByUserName(String username);
}
