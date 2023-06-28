package com.zero.acskybackend.repo;

import com.zero.acskybackend.model.po.UserInfo;

import java.util.List;

/**
 * UserInfoRepo
 *
 * @author ZERO
 * @date 2023/6/15
 */
public interface UserInfoRepo {

    /**
     * 通过账号查询用户信息
     * @param account 账号
     * @return 用户信息
     */
    UserInfo queryUserInfo(String account);

    /**
     * 更新用户信息
     * @param userInfo 用户信息
     * @return 受影响的行数
     */
    Integer updateUserInfo(UserInfo userInfo);

    /**
     * 修改用户密码
     * @param account 账号
     * @param password 密码
     * @return 受影响的行数
     */
    Integer updateUserPassword(String account, String password);

    /**
     * 添加一个用户信息
     * @param userInfo 用户信息
     * @return 受影响的行数
     */
    Integer insertOneUserInfo(UserInfo userInfo);

    /**
     * 批量添加用户信息
     * @param list 用户信息列表
     * @return 受影响的行数
     */
    Integer insertUserInfoList(List<UserInfo> list);

}
