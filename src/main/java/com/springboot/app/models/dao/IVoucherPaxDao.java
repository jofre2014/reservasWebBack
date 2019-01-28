package com.springboot.app.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.models.entity.VoucherPax;

public interface IVoucherPaxDao extends JpaRepository<VoucherPax, Long> {

}
