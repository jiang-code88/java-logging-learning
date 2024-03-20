package com.learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志打印和异常捕获的规范示例
 */
public class TestLogback12 {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestLogback12.class);

    /**
     * 创建用户并绑定手机
     * @param mobile 手机号信息
     * @param user 用户信息
     */
    public void createUserAndBindMobile(String mobile, User user){

        boolean debug = LOGGER.isDebugEnabled();

        LOGGER.info("开始创建用户并绑定手机号，args[mobile=[{}], user=[{}]]", mobile, user.toString());

        try {
            // 创建用户信息
            // user.setCreateTime(new Date());
            // user.setUpdateTime(new Date());
            // userRepository.insertSelective(user);
            if (debug) {
                LOGGER.debug("创建用户信息成功，insertUser=[{}]", user.toString());
            }

            // 绑定手机信息
            // userMobileRelationship relationship = new UserMobileRelationship();
            // relationship.setMobile(mobile);
            // relationship.setOpenId(user.getOpenId());
            // relationship.setCreateTime(new Date());
            // relationship.setUpdateTime(new Date());
            // userMobileRelationshipRepository.insertOnDuplicateKey(relationship);
            if (debug) {
                /*LOGGER.debug("绑定手机号成功，relationship=[{}]", relationship.toString());*/
            }

            LOGGER.info("创建用户并绑定手机号，userId=[{}]，openId=[{}]，mobile=[{}]",
                    user.getId(), user.getOpenId(), mobile);

        }catch (DuplicateKeyException e){
            LOGGER.warn("创建用户并绑定手机号失败，已存在相同的用户 openId=[{}]，mobile=[{}]",
                    user.getOpenId(), mobile);
            String errorMessage = String.format("创建用户发生冲突，openId=[{%s}]", user.getOpenId());
            throw new CreateConflictException(errorMessage);
        }

    }

}

class User{
    private String id;
    private String openId;

    public String getId() {
        return id;
    }

    public String getOpenId() {
        return openId;
    }
}

class DuplicateKeyException extends RuntimeException{

}

class CreateConflictException extends RuntimeException{
    public CreateConflictException(String message) {
        super(message);
    }
}
