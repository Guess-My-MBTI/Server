package com.hsstudy.GusessMyMBTI.Service;

import com.hsstudy.GusessMyMBTI.Repository.GuestRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class GuestServiceImpl implements GuestService{

    @Autowired
    private GuestRepository guestRepository;
}
