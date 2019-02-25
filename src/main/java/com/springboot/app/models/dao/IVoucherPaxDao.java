package com.springboot.app.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.models.entity.VoucherPax;

public interface IVoucherPaxDao extends JpaRepository<VoucherPax, Long> {
	
	public List<VoucherPax> deleteByVoucherID(int voucherId);
	
	public List<VoucherPax> findByVoucherID(int voucherId);

}
