package org.merchant.repo;

import org.merchant.entity.Merchant;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MerchantService {

    MerchantRepositiry repo;

    public MerchantService(MerchantRepositiry repo){
        this.repo = repo;
    }

    public Merchant saveMerchant(Merchant merchant){
        return repo.save(merchant);
    }

    public Optional<Merchant> getMerchant(Long id){
        return repo.findById(id);
    }
}
