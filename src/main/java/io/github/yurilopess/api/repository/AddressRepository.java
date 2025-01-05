package io.github.yurilopess.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AddressRepository extends JpaRepository<AddressRepository, UUID> {
}
