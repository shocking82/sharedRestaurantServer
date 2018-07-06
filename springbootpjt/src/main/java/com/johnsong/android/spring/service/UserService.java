package com.johnsong.android.spring.service;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.johnsong.android.jooq.Tables.USER;


@Service
@Transactional
public class UserService {
    private final DSLContext dsl;

    @Autowired
    public UserService(DSLContext dsl){
        this.dsl = dsl;
    }

    public  com.johnsong.android.jooq.tables.pojos.User getUser(String name){
        return dsl.select()
                .from(USER)
                .where(USER.NAME.like("%" + name))
                .limit(1)
                .fetchOneInto(com.johnsong.android.jooq.tables.pojos.User.class);

//        return new UserRecord(
//                record.getValue(USER.USER_ID).intValue(),
//                record.getValue(USER.EMAIL),
//                record.getValue(USER.LOGIN_PLATFORM),
//                record.getValue(USER.PICTURE),
//                record.getValue(USER.NAME)
//                );

    }
    public List<com.johnsong.android.jooq.tables.pojos.User> getUserList(){
        return dsl.select()
                .from(USER)
                .fetchInto(com.johnsong.android.jooq.tables.pojos.User.class);


    }
}