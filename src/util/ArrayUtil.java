package util;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Created by xuan on 2017/8/6 0006.
 */
public final class ArrayUtil {
    public static boolean isNotEmpty(Object[] array) {
        return !ArrayUtils.isEmpty(array);
    }

    private static boolean isEmpty(Object[] array) {
        return ArrayUtils.isEmpty(array);
    }
}
