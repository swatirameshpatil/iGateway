package org.merchant;

import org.merchant.entity.Merchant;
import org.merchant.repo.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/merchant")
public class MerchantController {

    @Autowired
    MerchantService mService;
    @GetMapping("/")
    public ResponseEntity<String> displayStartMsg(){
        return ResponseEntity.ok("Running");
    }
    @PostMapping(value = "/add")
    public ResponseEntity<Merchant> addMerchant(@RequestBody Merchant merchant){
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(mService.saveMerchant(merchant));
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<Merchant>> getMerchant(@PathVariable() String id){
        return ResponseEntity.ok(mService.getMerchant(Long.parseLong(id)));
    }

}
