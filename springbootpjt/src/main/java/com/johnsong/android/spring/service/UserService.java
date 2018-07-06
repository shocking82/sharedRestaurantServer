package com.johnsong.android.spring.service;
import com.johnsong.android.spring.jooq.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static com.johnsong.android.spring.jooq.tables.User.USER;


@Service
@Transactional
public class UserService {
    private final DSLContext dsl;

    @Autowired
    public UserService(DSLContext dsl){
        this.dsl = dsl;
    }

    public UserRecord getUser(String name){
        return dsl.select()
                .from(USER)
                .where(USER.NAME.like("%" + name + "%"))
                .fetchOneInto(UserRecord.class);

//        return new UserRecord(
//                record.getValue(USER.USER_ID).intValue(),
//                record.getValue(USER.EMAIL),
//                record.getValue(USER.LOGIN_PLATFORM),
//                record.getValue(USER.PICTURE),
//                record.getValue(USER.NAME)
//                );

    }
    public List<UserRecord> getUserList(){
        return dsl.select()
                .from(USER)
                .fetchInto(UserRecord.class);


    }
}