package com.ruoyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class RuoYiApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(RuoYiApplication.class, args);
        /*System.out.println("启动成功！\n" +
                "         _     \n" +
                " _ __ __| |___ \n" +
                "| '__/ _` / __|\n" +
                "| | | (_| \\__ \\\n" +
                "|_|  \\__,_|___/\n" +
                "               ");*/
        System.out.println("启动成功!\n" +
                "         __.__   \n" +
                "_______ |__|  |  \n" +
                "\\_  __ \\|  |  |  \n" +
                " |  | \\/|  |  |__\n" +
                " |__/\\__|  |____/\n" +
                "    \\______|     ");
    }
}
