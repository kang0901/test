package com.example.test.commom;

/**
 * @author wangjian
 */
public enum State {
    /**
     * 请求成功
     */
    RET_STATE_SUCCESS(0, "请求成功"),
    /**
     * 账号或密码错误，请求失败
     */
    RET_STATE_FAILED(1, "账号或密码错误，请求失败"),
    /**
     * 系统异常
     */
    RET_STATE_SYSTEM_ERROR(2, "系统异常"),
    /**
     * 提交参数异常
     */
    RET_STATE_PARAM_ERROR(3, "提交参数异常"),
    /**
     * token过期
     */
    RET_STATE_TOKEN_TIMEOUT(4, "token过期"),
    /**
     * 用户已存在
     */
    USER_IS_EXIST(6, "用户已存在"),
    /**
     * 用户不存在
     */
    USER_NOT_EXIST(7, "用户不存在"),
    /**
     * 账号已冻结
     */
    USER_FREEZE(8, "账号已冻结"),
    /**
     * 角色已存在
     */
    RULE_IS_EXIST(9, "角色已存在"),
    /**
     * 超时
     */
    OVERTIME(10, "超时"),
    /**
     * 已存在
     */
    IS_EXIST(11, "已存在"),
    /**
     * 验证码不正确
     */
    USER_VCODE(12, "验证码不正确"),

    /**
     * 监控点不在线
     */
    RET_STATE_POINT_OFFLINE(13,"监控点不在线"),

    /**
     * 用户已过期
     */
    USER_NOT_DEADLINE(14,"用户已过期"),

    /**
     * 文件已存在
     */
    FILE_IS_EXISTS(15,"文件已存在");

    State(int number, String description) {
        this.state = number;
        this.msg = description;
    }

    private int state;
    private String msg;

    public int getState() {
        return state;
    }

    public String getMsg() {
        return msg;
    }

}
