package com.vis.prime.ivr.db.ws.repository;

import com.vis.prime.ivr.db.ws.entity.Usage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsageRepository  extends JpaRepository<Usage, String> {

}
