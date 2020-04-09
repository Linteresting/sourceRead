/*
 * All rights Reserved, Designed By DataDriver
 * Copyright:    DataDriver.Inc
 * Company:      Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */

package cn.linteresting.test.enumtest;

public enum  UserRoleEnum implements RoleOperation {

    ROLE_ROOT_ADMIN{
        @Override
        public String op() {
            return "ROLE_ROOT_ADMIN" + "has a";
        }
    },

    ROLE_ORDER_ADMIN{
        @Override
        public String op() {
            return "ROLE_ORDER_ADMIN" + "has b";
        }
    },

    ROLE_NORMAL{
        @Override
        public String op() {
            return "ROLE_NORMAL" + "has c";
        }
    }

}
