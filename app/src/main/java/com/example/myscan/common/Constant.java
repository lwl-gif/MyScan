package com.example.myscan.common;

/**
 * @Author: Wallace
 * @Description: zxing常量
 * @Date: Created 0:23 2021/4/23
 * @Modified: by who yyyy-MM-dd
 */
public class Constant {
    public static final int DECODE = 1;
    public static final int DECODE_FAILED = 2;
    public static final int DECODE_SUCCEEDED = 3;
    public static final int LAUNCH_PRODUCT_QUERY = 4;
    public static final int QUIT = 5;
    public static final int RESTART_PREVIEW = 6;
    public static final int RETURN_SCAN_RESULT = 7;
    public static final int FLASH_OPEN = 8;
    public static final int FLASH_CLOSE = 9;
    public static final int REQUEST_IMAGE = 10;
    public static final String CODED_CONTENT = "codedContent";
    public static final String CODED_BITMAP = "codedBitmap";

    /**传递的zxingconfing*/
    public static final String INTENT_ZXING_CONFIG = "zxingConfig";
}
