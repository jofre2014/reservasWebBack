/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.dao;

import com.springboot.app.models.entity.Voucher;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Romina
 */
public interface IVoucherDao extends JpaRepository<Voucher, Integer> {

}
