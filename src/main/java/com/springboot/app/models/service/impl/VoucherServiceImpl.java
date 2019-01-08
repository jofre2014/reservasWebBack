/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springboot.app.models.service.impl;

import com.springboot.app.models.dao.IVoucherDao;
import com.springboot.app.models.entity.Voucher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.app.models.service.IVoucherService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Romina
 */
@Service
@Transactional(readOnly = true)
public class VoucherServiceImpl implements IVoucherService {

    @Autowired
    IVoucherDao iVoucherDao;

    @Override
    public List<Voucher> findAll() {
        return iVoucherDao.findAll();
    }
}
