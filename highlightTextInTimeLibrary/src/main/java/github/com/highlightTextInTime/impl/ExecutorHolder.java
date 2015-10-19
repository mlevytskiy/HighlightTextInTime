package github.com.highlightTextInTime.impl;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by max on 02.10.15.
 */
public class ExecutorHolder {

    private static final int CORE_POOL_SIZE = 1;
    private static final int MAXIMUM_POOL_SIZE = 1;
    private static final int KEEP_ALIVE = 1;

    private static final BlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(128);

    public static final Executor STACK_EXECUTOR
            = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, KEEP_ALIVE, TimeUnit.SECONDS,
            queue);
}
