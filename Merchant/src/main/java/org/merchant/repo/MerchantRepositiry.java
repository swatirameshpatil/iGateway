package org.merchant.repo;

import org.merchant.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantRepositiry extends JpaRepository<Merchant, Long> {
}
