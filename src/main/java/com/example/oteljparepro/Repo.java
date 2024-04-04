package com.example.oteljparepro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public interface Repo extends JpaRepository<Repo.SampleEntity, Long> {

    Optional<SampleEntity> findByName(String name);

    @Entity(name = "samples")
    class SampleEntity {
        @Id
        private Long id;
        private String name;
    }
}
