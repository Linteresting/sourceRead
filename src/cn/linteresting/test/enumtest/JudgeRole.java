/*
 * All rights Reserved, Designed By DataDriver
 * Copyright:    DataDriver.Inc
 * Company:      Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */

package cn.linteresting.test.enumtest;

public class JudgeRole {

    /**
     * 通过角色来判断执行操作
     * 不用枚举  if/else 判断角色
     * @param roleName 角色名称
     * @return 执行角色对应操作
     */
    public String judgeRole(String roleName) {
        return UserRoleEnum.valueOf(roleName).op();
    }

}
