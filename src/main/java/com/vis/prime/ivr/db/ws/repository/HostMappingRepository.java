package com.vis.prime.ivr.db.ws.repository;

import com.vis.prime.ivr.db.ws.entity.HostMapping;
import com.vis.prime.ivr.db.ws.entity.HostMappingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HostMappingRepository extends JpaRepository<HostMapping, HostMappingId> {

   HostMapping findByIdHostValueAndStatus(String hostValue,String status);
}
