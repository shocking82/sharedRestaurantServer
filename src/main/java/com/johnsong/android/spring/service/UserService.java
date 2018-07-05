package com.johnsong.android.spring.service;
import com.johnsong.android.spring.jooq.banana.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

import static com.johnsong.android.spring.jooq.banana.tables.User.USER;

@Service
@Transactional
public class UserService {
    private final DSLContext dsl;

    @Autowired
    public UserService(DSLContext dsl){
        this.dsl = dsl;
    }

    public UserRecord getUser(Map<String, String> params){
        Record record = dsl.select()
                .from(USER)
                .where(USER.NAME.like("%" + params.get("NAME") + "%"))
                .fetchOne();

        return new UserRecord(
                record.getValue(USER.USER_ID).intValue(),
                record.getValue(USER.EMAIL),
                record.getValue(USER.LOGIN_PLATFORM),
                record.getValue(USER.PICTURE),
                record.getValue(USER.NAME)
                );

    }
}