package com.yibao.music.util;

import com.yibao.music.model.MusicBean;

import java.util.List;
import java.util.Random;

/**
 * Author：Sid
 * Des：${TODO}
 * Time:2017/8/14 05:01
 * @author Stran
 */
public class RandomUtil {
    public static int getRandomPostion(List<MusicBean> list) {
        Random random = new Random();
        return random.nextInt(list.size()) + 1;

    }
}
