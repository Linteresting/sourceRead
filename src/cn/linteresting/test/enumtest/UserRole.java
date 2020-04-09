/*
 * All rights Reserved, Designed By DataDriver
 * Copyright:    DataDriver.Inc
 * Company:      Zhuo Wo Infomation Technology (ShangHai) CO.LTD
 */
package cn.linteresting.test.enumtest;

public enum UserRole {

    ROLE_ROOT_ADMIN("系统管理员", 1),

    ROLE_ORDER_ADMIN("订单管理员", 2),

    ROLE_NORMAL("普通用户", 3),
    ;

    private final String roleName;

    private final Integer roleCode;

    UserRole(String name, int code) {
        this.roleName = name;
        this.roleCode = code;
    }

    public String getRoleName() {
        return roleName;
    }

    public Integer getRoleCode() {
        return roleCode;
    }

    /**
     * 根据用户角色名字获取角色编码
     * @param roleName 角色名字
     * @return roleCode 角色编码
     */
    public static Integer getUserRoleCodeByUserRoleName(String roleName) {
        for (UserRole role : UserRole.values()) {
            if (role.getRoleName().equals(roleName)) {
                return role.getRoleCode();
            }
        }
        return null;
    }

}
