package com.xsp.util;

import org.mybatis.generator.api.ShellRunner;
public class generator {
    public static void main (String []args){

        args = new String[] { "-configfile", "src\\main\\resources\\generator.xml", "-overwrite" };
        ShellRunner.main(args);
        System.out.print(args);
    }
}
