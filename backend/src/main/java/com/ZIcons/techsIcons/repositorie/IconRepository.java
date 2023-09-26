package com.ZIcons.techsIcons.repositorie;

import com.ZIcons.techsIcons.model.Icon;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IconRepository extends JpaRepository<Icon, Long> {
    List<Icon> findByName(String name);
}
