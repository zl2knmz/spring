package liang.service.impl;

import liang.mapper.AccountsMapper;
import liang.pojo.Accounts;
import liang.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zl
 * @date 2022/11/12 23:55
 */
@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    AccountsMapper accountsMapper;

    public int save(Accounts accounts) {
        return accountsMapper.insert(accounts);
    }
}
