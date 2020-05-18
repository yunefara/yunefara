package com.yunefara.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yunefara.controller.BaseEntity;

public interface BaseEntityRepository<T extends BaseEntity> extends JpaRepository<T, Long>{

}
