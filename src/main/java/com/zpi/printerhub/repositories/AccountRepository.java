package com.zpi.printerhub.repositories;

import com.zpi.printerhub.entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
