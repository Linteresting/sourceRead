/*
 * All rights Reserved, Designed By DataDriver
 * Copyright:    DataDriver.Inc
 * Company:      Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */

package cn.linteresting.test;


import cn.linteresting.test.enumtest.UserRole;

public class Test {

    public static void main(String[] args) {

        // 1. 枚举values()方法，返回枚举常量的数组集合
        UserRole[] values = UserRole.values();
        for (UserRole role : UserRole.values()) {
            System.out.println(role);
        }

        UserRole role1 = UserRole.ROLE_NORMAL;
        UserRole role2 = UserRole.ROLE_ORDER_ADMIN;
        UserRole role3 = UserRole.ROLE_ROOT_ADMIN;

        // 2. ordinal() 方法返回枚举常量的序数，从0开始
        System.out.println(role1.ordinal());
        System.out.println(role2.ordinal());
        System.out.println(role3.ordinal());

        // 3. compareTo() 方法枚举常量直接比较  ordinal值的差值
        // return self.ordinal - other.ordinal;
        System.out.println(role1.compareTo(role1));
        System.out.println(role1.compareTo(role2));

        // 4. name() 方法获得枚举常量的名称
        System.out.println(role1.name());
        System.out.println(role2.name());
        System.out.println(role3.name());

        // 5. valueOf() 方法返回指定名称的枚举常量
        System.out.println(UserRole.valueOf("ROLE_ROOT_ADMIN"));

        UserRole role = UserRole.ROLE_NORMAL;

        // 6.枚举用在switch-case 语句中意义更加明确
        switch (role) {
            case ROLE_NORMAL:
                System.out.println("普通用户");
                break;
            case ROLE_ROOT_ADMIN:
                System.out.println("系统管理员");
                break;
            case ROLE_ORDER_ADMIN:
                System.out.println("订单管理员");
                break;
        }

        System.out.println(role1.getRoleCode() + role1.getRoleName());


    }

}