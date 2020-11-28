package com.statemachine.handler;

import com.statemachine.context.CommonContext;

public abstract class AbstractHandler {

    public abstract void execute(CommonContext commonContext);

    public abstract void save2Db(CommonContext commonContext);
}
