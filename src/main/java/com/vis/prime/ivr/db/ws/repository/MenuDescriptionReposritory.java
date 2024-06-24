package com.vis.prime.ivr.db.ws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vis.prime.ivr.db.ws.entity.MenuDescription;

@Repository
public interface MenuDescriptionReposritory extends JpaRepository<MenuDescription, String> {

}
